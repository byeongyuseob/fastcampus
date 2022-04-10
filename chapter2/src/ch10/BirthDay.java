package ch10;

public class BirthDay {
    private int day, month, year;
    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if (isValid) {
            System.out.printf("%d년 %d월 %d일 입니다.", year, month, day);
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
