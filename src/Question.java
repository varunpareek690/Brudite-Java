import java.util.List;
public class Question {
    private int QuestionId;
    private int scoreofQuestion;
    private List<Answer> answers;
    Answer answerObj = new Answer();
    int answerId = answerObj.getAnsKey();
    TechStack techStackObj = new TechStack();
    int tsId = techStackObj.getTechStackId();
    Assignment assignmentObj = new Assignment();
    int asId = assignmentObj.getAssignmentId();
    // techstackid, assignmentid
}
