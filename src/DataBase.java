import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import org.json.JSONObject;

public class DataBase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the username: ");
        String username = sc.next();
        String urlString = "https://api.github.com/users/" + username;


        String jdbcUrl = "jdbc:mysql://HOST:PORT/defaultdb";
        String usernameDB = "USERNAME"; // replace with your MySQL username
        String passwordDB = "PASSWORD"; // replace with your MySQL password

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // Success

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                in.close();
                JSONObject jsonResponse = new JSONObject(response.toString());

                String login = jsonResponse.getString("login");
                int id = jsonResponse.getInt("id");
                String name = jsonResponse.optString("name");
                int publicRepos = jsonResponse.getInt("public_repos");
                int followers = jsonResponse.getInt("followers");
                int following = jsonResponse.getInt("following");
                String bio = jsonResponse.optString("bio"); // using optString to handle null case

                System.out.println("GitHub User Data:");
                System.out.println("Login: " + login);
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Public Repositories: " + publicRepos);
                System.out.println("Followers: " + followers);
                System.out.println("Following: " + following);
                System.out.println("Bio: " + bio);

                try (Connection conn = DriverManager.getConnection(jdbcUrl, usernameDB, passwordDB)) {

                    String createTableSQL = "CREATE TABLE IF NOT EXISTS github_users ("
                            + "login VARCHAR(255), "
                            + "id INT PRIMARY KEY, "
                            + "name VARCHAR(255), "
                            + "public_repos INT, "
                            + "followers INT, "
                            + "following INT, "
                            + "bio TEXT)";
                    try (Statement stmt = conn.createStatement()) {
                        stmt.execute(createTableSQL);
                    }

                    String sql = "INSERT INTO github_users (login, id, name, public_repos, followers, following, bio) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                        pstmt.setString(1, login);
                        pstmt.setInt(2, id);
                        pstmt.setString(3, name);
                        pstmt.setInt(4, publicRepos);
                        pstmt.setInt(5, followers);
                        pstmt.setInt(6, following);
                        pstmt.setString(7, bio);
                        pstmt.executeUpdate();
                        System.out.println("Data inserted into the database successfully.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("GET request failed. Response Code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
