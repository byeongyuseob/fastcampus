package ch02;

public class Student implements Cloneable{
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }


   public void setStudentName(String name){
        this.name = name;
   }

    @Override
    public String toString() {
        return number + "," + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student std = (Student) obj;
            return this.name == std.name;


        }
        return false;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
