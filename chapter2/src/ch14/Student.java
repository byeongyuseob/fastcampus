package ch14;

public class Student {

    String name;
    int money;

    Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.printf("%s님의 잔액은 %d원 입니다.\n", name, money);

    }
}
