package ch03;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

    public VIPCustomer(int id, String name) {
        super(id, name);

        grade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;

        System.out.println("VIPCustomer(int, String) call");
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
