package patterns.behavioral.strategy.payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PayByCreditCard implements PayStrategy{
    private static BufferedReader READER;

    private static Map<String , String> DATABASE = new HashMap<>();
    private CreditCard card;
    @Override
    public boolean pay(int payAmount) {
        if (cardIsParent()) {
            System.out.println("Paying " + payAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - payAmount);
            return true;
        }
        return false;
    }


    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Enter the Card Verification Value code: ");
            String  cardVerificationValue = READER.readLine();

            if (CreditCardValidator.isValid(number)) {
                card = new CreditCard(number, date, cardVerificationValue);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private boolean cardIsParent() {
        return card != null;
    }

    public static void main(String[] args) {
        System.out.println(READER);
    }
}
