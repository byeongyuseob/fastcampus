package ch04;

class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(10010, "soonshin Lee");
        customer.bonusPoint = 1000;
        int price = customer.calcPrice(1000);
        customer.showCustomerInfo();
        System.out.println(price);


        VIPCustomer vipCustomer = new VIPCustomer(10020, "woochul Park");
        vipCustomer.bonusPoint = 80000;
        price = vipCustomer.calcPrice(1000);
        System.out.println(price);
        vipCustomer.showCustomerInfo();

        Customer vc = new VIPCustomer(12345, "noName");
        price = vc.calcPrice(1000);
        System.out.println(price);
    }
}