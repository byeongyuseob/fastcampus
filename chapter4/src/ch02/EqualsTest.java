package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(100, "Lee");
        Student student2 = new Student(100, "Lee");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer i = 96354;
        System.out.println(i.hashCode());

        System.out.println(System.identityHashCode(student1));
        System.out.println(System.identityHashCode(student2));

        student1.setStudentName("Kim");
        Student copyStudent = (Student) student1.clone();
        System.out.println(copyStudent);

    }
}
