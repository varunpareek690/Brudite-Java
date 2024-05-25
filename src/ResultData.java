import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ResultData {
    private List<Result> results;

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

}
