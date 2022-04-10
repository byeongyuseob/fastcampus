package ch14;

public class Bus {
    int number;
    int passengerCount;
    int income;

    public Bus(int number) {
        this.number = number;
    }

    public void take(int money) {
        this.income += money;
        this.passengerCount += 1;
    }

    public void showBusInfo() {
        System.out.printf("%d번 버스의 승객수는 %d명 이고, 수입은 %d원 입니다.\n", number, passengerCount, income);
    }
}
