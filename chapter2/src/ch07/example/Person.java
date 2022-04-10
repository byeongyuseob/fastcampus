package ch07.example;

/*
 name, age, tall, weight, sex
 */

public class Person {
    public String name;
    public int age;
    public int tall;
    public int weight;
    public String sex;

    public Person(String name, int age, int tall, int weight, String sex) {
        this.name = name;
        this.age = age;
        this.tall = tall;
        this.weight = weight;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("키가 %d 이고 몸무게가 %d 킬로인 남성이 있습니다. 이름은 %s 이고 나이는 %d세입니다.", tall, weight, name, age);
    }
}
