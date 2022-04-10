package ch18.example;

public class CarFactory {

    private static int carNum = 1000;
    private static CarFactory instance = new CarFactory();
    public static CarFactory getInstance() {
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(){
        return new Car(++carNum);
    }
}
