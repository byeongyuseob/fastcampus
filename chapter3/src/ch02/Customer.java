package ch02;

public class Customer {
    protected int id;
    protected String name;
    protected String grade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        grade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public void showCustomerInfo(){
        System.out.printf("%s님의 등급은 %s이며, 보너스 포인트는 %s 입니다.\n", name, grade, bonusPoint);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
