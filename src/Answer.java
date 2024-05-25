import java.util.Objects;

public class Answer {
    private int ansKey;
    private String ansText;
    private boolean isCorrect;

    public Answer(){

    }

    public Answer(int ansKey, String ansText,boolean isCorrect) {
        this.ansKey = ansKey;
        this.ansText = ansText;
        this.isCorrect = isCorrect;
    }

    public int getAnsKey() {
        return ansKey;
    }

    public void setAnsKey(int ansKey) {
        this.ansKey = ansKey;
    }

    public String getAnsText() {
        return ansText;
    }

    public void setAnsText(String ansText) {
        this.ansText = ansText;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return ansKey == answer.ansKey && isCorrect == answer.isCorrect && Objects.equals(ansText, answer.ansText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ansKey, ansText, isCorrect);
    }

    @Override
    public String toString() {
        return "Answer{" +
                "ansKey=" + ansKey +
                ", ansText='" + ansText + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
