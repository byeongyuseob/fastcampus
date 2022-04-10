package ch14;

import ch14.Student;

class StudentTest {
    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);

        Bus bus = new Bus(100);
        Subway subway = new Subway("초록");

        james.takeBus(bus);
        tomas.takeSubway(subway);

        james.showInfo();
        tomas.showInfo();
        bus.showBusInfo();
        subway.showSubwayInfo();
    }
}