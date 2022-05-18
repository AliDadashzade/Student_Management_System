public class ExamResult {
    private Subject subject;
    private int score;
    //Constructor
    public ExamResult(Subject subject, int score){
        this.subject = subject;
        this.score = score;
    }
    //Set
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //Get
    public Subject getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }
}
