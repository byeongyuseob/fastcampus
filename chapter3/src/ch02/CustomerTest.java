package ch02;

class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        VIPCustomer vipCustomer = new VIPCustomer();

        customer.setName("soonshin Lee");
        customer.setId(10010);
        customer.bonusPoint = 1000;

        customer.showCustomerInfo();


        vipCustomer.setName("woochul Park");
        vipCustomer.setId(10020);
        vipCustomer.bonusPoint = 80000;
        vipCustomer.showCustomerInfo();
    }
}