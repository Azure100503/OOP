package patterns.behavioral.strategy.payment;

public class Order {
    private int totalCost = 0;
    private  boolean isClosed = false;


    public void setPayMethod(PayStrategy payMethod){
        payMethod.collectPaymentDetails();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}
