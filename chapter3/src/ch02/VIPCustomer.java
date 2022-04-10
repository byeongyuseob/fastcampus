package ch02;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;


    public VIPCustomer() {
        grade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
    }

    @Override
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }
}
