package ch09;

public class Student {
    public int studentId;
    public String studntName;

    Subject korea;
    Subject math;

    public Student(int studentId, String studntName) {
        this.studentId = studentId;
        this.studntName = studntName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMath(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    @Override
    public String toString() {
        return String.format("%s 학생의 총점은 %d점 입니다.", studntName, (korea.score + math.score));
    }
}
