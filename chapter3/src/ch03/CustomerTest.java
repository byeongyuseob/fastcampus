package ch03;

class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(10010, "soonshin Lee");
        customer.bonusPoint = 1000;
        customer.showCustomerInfo();


        VIPCustomer vipCustomer = new VIPCustomer(10020, "woochul Park");
        vipCustomer.bonusPoint = 80000;
        vipCustomer.showCustomerInfo();

        Customer vc = new VIPCustomer(12345, "NoName");
        vc.showCustomerInfo();


    }
}