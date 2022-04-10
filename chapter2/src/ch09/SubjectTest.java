package ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student student = new Student(100, "byeon");
        student.setKorea("국어", 100);
        student.setMath("수학", 9);

        System.out.println(student);


        Student student2 = new Student(200, "kim");
        student2.setKorea("국어", 50);
        student2.setMath("수학", 89);

        System.out.println(student2);
    }
}
