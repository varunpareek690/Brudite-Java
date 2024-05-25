import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class JsonUtil {

    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }

        if (obj instanceof String || obj instanceof Character) {
            return "\"" + obj.toString() + "\"";
        }

        if (obj instanceof Number || obj instanceof Boolean) {
            return obj.toString();
        }

        if (obj instanceof Date) {
            return "\"" + obj.toString() + "\"";
        }

        if (obj instanceof Collection) {
            Collection<?> collection = (Collection<?>) obj;
            StringBuilder json = new StringBuilder("[");
            for (Object item : collection) {
                json.append(toJson(item)).append(",");
            }
            if (!collection.isEmpty()) {
                json.setLength(json.length() - 1); // Remove last comma
            }
            json.append("]");
            return json.toString();
        }

        if (obj instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) obj;
            StringBuilder json = new StringBuilder("{");
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                json.append(toJson(entry.getKey()))
                        .append(":")
                        .append(toJson(entry.getValue()))
                        .append(",");
            }
            if (!map.isEmpty()) {
                json.setLength(json.length() - 1); // Remove last comma
            }
            json.append("}");
            return json.toString();
        }

        StringBuilder json = new StringBuilder();
        json.append("{\n");

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(obj);

                json.append("  \"").append(field.getName()).append("\": ")
                        .append(toJson(value))
                        .append(",\n");

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        if (json.length() > 2) {
            json.setLength(json.length() - 2); // Remove last comma
        }
        json.append("\n}");
        return json.toString();
    }
}
