public class Subject {
    private String subject;
    private int credit;
    public Subject(String subject, int credit){
        this.subject = subject;
        this.credit = credit;
    }
    public String getSubject() {
        return subject;
    }

    public int getCredit() {
        return credit;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

}
