package ch23.example;

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Lee");
        Student student2 = new Student("Kim");

        student1.addSubject("국어", 100);
        student1.addSubject("수학", 50);

        student2.addSubject("국어", 70);
        student2.addSubject("수학", 85);
        student2.addSubject("영어", 100);

        student1.getTotalScore();
        student2.getTotalScore();

        student1.getScoreBySubject();
        student2.getScoreBySubject();

    }
}