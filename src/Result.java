import java.util.Date;
import java.util.Objects;

public class Result {
    private int resultId;
    private Student student;
    private Assignment assignment;
    private Trainer trainer;
    private int score;
    private String feedback;
    private Date submissionDate;

    public Result() {
    }

    public Result(int resultId, Student student, Assignment assignment, int score, String feedback, Date submissionDate) {
        this.resultId = resultId;
        this.student = student;
        this.assignment = assignment;
//        this.trainer = trainer;
        this.score = score;
        this.feedback = feedback;
        this.submissionDate = submissionDate;
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return resultId == result.resultId && score == result.score && Objects.equals(student, result.student) && Objects.equals(assignment, result.assignment) && Objects.equals(trainer, result.trainer) && Objects.equals(feedback, result.feedback) && Objects.equals(submissionDate, result.submissionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId, student, assignment, trainer, score, feedback, submissionDate);
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultId=" + resultId +
                ", student=" + student +
                ", assignment=" + assignment +
                ", trainer=" + trainer +
                ", score=" + score +
                ", feedback='" + feedback + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }
}
