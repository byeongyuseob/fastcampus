package ch12;

public class Person {
    private final String name;
    private final int age;

    public Person() {
        this("", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this;
    }

    public String showPersonInfo() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.showPersonInfo());

        Person person2 = person.getPerson();
        System.out.println(person2);
    }
}
