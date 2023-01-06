package patterns.behavioral.strategy.payment;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cardVerificationValue;

    CreditCard(String number, String date, String cardVerificationValue) {
        this.amount = 10000;
        this.number = number;
        this.date = date;
        this.cardVerificationValue = cardVerificationValue;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }
}
