package ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.setStudentID(5340);
        student.setStudentName("Byeon");
        student.address = "경기도 안양시 만안구";

        student.showStudentInfo();
    }
}

// instance는 heap memory에 위치한다.