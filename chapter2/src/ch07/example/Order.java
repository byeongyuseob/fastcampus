package ch07.example;

/*
id, phoneNumber, address, date, time, price, number
 */
public class Order {
    private final String id;
    private final String phoneNumber;
    private final String address;
    private final int date;
    private final int time;
    private final int price;
    private final String number;

    public Order(String id, String phoneNumber, String address, int date, int time, int price, String number) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        return "주문 접수 번호 : " + id + "\n" +
                "주문 핸드폰 번호 : " + phoneNumber + "\n" +
                "주문 집 주소 : " + address + "\n" +
                "주문 날짜 : " + date + "\n" +
                "주문 시간 : " + time + "\n" +
                "주문 가격 : " + price + "\n" +
                "메뉴 번호 : " + number;
    }
}
