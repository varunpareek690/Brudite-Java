import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class ResultData {
    private final List<Result> results; // Final suggested by IntelliJ ...? WHY

    public ResultData(){
        this.results = new ArrayList<>();
    }

    public List<Result> getResults() {
        return results;
    }

    public void addResult(Result result) {
        this.results.add(result);
    }

    public List<Result> getResultsByStudent(Student student) {
        return results.stream()
                .filter(result -> result.getStudent().equals(student))
                .collect(Collectors.toList());
    }
    public Student findHighestPerformer() {
        return results.stream()
                .max(Comparator.comparingInt(Result::getScore))
                .map(Result::getStudent)
                .orElse(null);

    }
    public Student findSecondHighestPerformer() {
        return results.stream()
                .sorted(Comparator.comparingInt(Result::getScore).reversed())
                .skip(1)
                .findFirst()
                .map(Result::getStudent)
                .orElse(null);
    }

    public void rankingList(){
        results.stream()
                .sorted(Comparator.comparingInt(Result::getScore).reversed())
                .map(result->result.getStudent().getName())
                .forEach(System.out::println);
    }
    public List<Student> studentsLessThan60(){
        return results.stream()
                .filter(result->result.getScore() <60)
                .map(Result::getStudent)
                .collect(Collectors.toList());

    }

    public void printResultsForStudent(ResultData resultData,String studentName) {

        Student student = results.stream()
                .map(Result::getStudent)
                .filter(s -> s.getName().equals(studentName))
                .findFirst()
                .orElse(null);


            List<Result> studentResults = resultData.getResultsByStudent(student);
            String resultJson = JsonUtil.toJson(studentResults);
            System.out.println(resultJson);
            System.out.println("Results for " + studentName + ": " + resultJson);


        }



}
