package ch06;

public class Student {
    public int studentNumber;
    public String studentName = "";
    public int grade;

    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return String.format("%s 학생의 학번은 %d이고, %d학년 입니다.", studentName, studentNumber, grade);
    }
}
