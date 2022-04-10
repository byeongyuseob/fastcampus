package ch04;

public class Student {
    private int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.printf("%d %s %s", studentID, studentName, address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}

