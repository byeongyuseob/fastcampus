package ch23.example;

import java.util.ArrayList;

public class Student {
    private String name;
    private int number;

    private ArrayList<Subject> subjectArrayList = new ArrayList<>();

    private static int ID = 1000;

    public Student(String name) {
        this.name = name;
        this.number = ID++;
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject(name, score);
        this.subjectArrayList.add(subject);
    }

    public void getTotalScore() {
        int total = 0;
        for (Subject subject : subjectArrayList)
            total += subject.getScore();
        System.out.printf("%s 학생의 총 점수는 %d점 입니다.\n", this.name, total);
    }

    public void getScoreBySubject(){
        for (Subject subject: subjectArrayList)
            System.out.printf("%s 학생의 %s 과목 점수는 %d점 입니다.\n", this.name, subject.getSubject(), subject.getScore());
    }
}
