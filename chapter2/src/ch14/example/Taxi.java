package ch14.example;

public class Taxi {
    public String name;
    public int income;

    public Taxi(String name) {
        this.name = name;
    }

    public void take(int money) {
        this.income += money;
    }

    public void showTaxiInfo() {
        System.out.printf("%s 택시 수입은 %d원 입니다.", name, income);
    }
}
