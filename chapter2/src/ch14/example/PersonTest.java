package ch14.example;

import ch14.example.Person;

class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Edward", 20000);
        Taxi taxi = new Taxi("잘 나간다 운수");

        person.takeTaxi(taxi);

        person.showPersonInfo();
        taxi.showTaxiInfo();
    }
}