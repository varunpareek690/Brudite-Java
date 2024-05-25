import java.util.List;
import java.util.Objects;

public class Question {
    private int questionId;
    private int scoreofQuestion;
    private List<Answer> answers;
    private Answer answerKey;
    private TechStack techStack;
    private Assignment assignment;

    public Question(int questionId, int scoreofQuestion, List<Answer> answers, Answer answerKey, TechStack techStack, Assignment assignment) {
        this.questionId = questionId;
        this.scoreofQuestion = scoreofQuestion;
        this.answers = answers;
        this.answerKey = answerKey;
        this.techStack = techStack;
        this.assignment = assignment;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getScoreofQuestion() {
        return scoreofQuestion;
    }

    public void setScoreofQuestion(int scoreofQuestion) {
        this.scoreofQuestion = scoreofQuestion;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Answer getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(Answer answerKey) {
        this.answerKey = answerKey;
    }

    public TechStack getTechStack() {
        return techStack;
    }

    public void setTechStack(TechStack techStack) {
        this.techStack = techStack;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public int getTechStackId() {
        return techStack.getTechStackId();
    }

    public int getAssignmentId() {
        return assignment.getAssignmentId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return questionId == question.questionId && scoreofQuestion == question.scoreofQuestion && Objects.equals(answers, question.answers) && Objects.equals(answerKey, question.answerKey) && Objects.equals(techStack, question.techStack) && Objects.equals(assignment, question.assignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionId, scoreofQuestion, answers, answerKey, techStack, assignment);
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", scoreofQuestion=" + scoreofQuestion +
                ", answers=" + answers +
                ", answerKey=" + answerKey +
                ", techStack=" + techStack +
                ", assignment=" + assignment +
                '}';
    }
}
