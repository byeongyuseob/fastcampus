package ch06;

import javax.crypto.spec.IvParameterSpec;
import java.util.ArrayList;

class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();

        Customer customerA = new Customer(10001, "A");
        Customer customerB = new Customer(10002, "B");

        Customer GoldCustomerA = new GoldCustomer(20001, "C");
        Customer GoldCustomerB = new GoldCustomer(20002, "D");

        Customer VIPCustomerA = new VIPCustomer(30001, "E");

        customerArrayList.add(customerA);
        customerArrayList.add(customerB);
        customerArrayList.add(GoldCustomerA);
        customerArrayList.add(GoldCustomerB);
        customerArrayList.add(VIPCustomerA);

        int price = 10000;

        for (Customer customer : customerArrayList){
            int cost = customer.calcPrice(price);
            System.out.printf("%s님이 지불하신 금액은 %d원 입니다.\t\t",customer.getName(),cost);
            customer.showCustomerInfo();
        }

        if(GoldCustomerA instanceof GoldCustomer){
            GoldCustomer vc = (GoldCustomer) GoldCustomerA;
            GoldCustomerA.showCustomerInfo();
        }
    }
}