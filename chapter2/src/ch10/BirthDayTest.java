package ch10;

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay birthday = new BirthDay();

        birthday.setDay(5);
        birthday.setMonth(12);
        birthday.setYear(2022);

        birthday.showDate();
    }
}
