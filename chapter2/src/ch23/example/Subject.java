package ch23.example;

public class Subject {
    private String subject;
    private int score;

    public Subject(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }
}
