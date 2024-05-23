public class Answer {
    private int ansKey;
    private String ansText;

    public Answer(){

    }

    public Answer(int ansKey, String ansText) {
        this.ansKey = ansKey;
        this.ansText = ansText;
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

    @Override
    public String toString() {
        return "Answer{" +
                "ansKey=" + ansKey +
                ", ansText='" + ansText + '\'' +
                '}';
    }
}
