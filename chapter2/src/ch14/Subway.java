package ch14;

public class Subway {
    String number;
    int passengerCount;
    int income;

    public Subway(String number) {
        this.number = number;
    }

    public void take(int money) {
        this.income += money;
        this.passengerCount += 1;
    }

    public void showSubwayInfo() {
        System.out.printf("%s색 지하철의 승객수는 %d명 이고, 수입은 %d원 입니다.", number, passengerCount, income);
    }
}
