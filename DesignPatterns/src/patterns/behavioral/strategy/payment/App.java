package patterns.behavioral.strategy.payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {
    private static BufferedReader READER = Input.getReader();

    private static Map<Integer , Integer> priceOnProducts = new HashMap<>();
    private static Order order = new Order();
    private static PayStrategy strategy;
    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);

    }
    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int count;
            String continueChoice;

            do {
                System.out.print("Please, select a product:" + "\n" + "1 - Mother board" + "\n"
                        + "2 - CPU" + "\n"
                        + "3 - HDD" + "\n"
                        + "4 - Memory" + "\n");
                int choice = Integer.parseInt(READER.readLine());
                int cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                count = Integer.parseInt(READER.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = READER.readLine();

            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:" + "\n"
                        + "1 - PalPay" + "\n"
                        + "2 - Credit Card");
                String paymentMethod = READER.readLine();
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                    order.setPayMethod(strategy);
                } else {
                    strategy = new PayByCreditCard();
                    order.setPayMethod(strategy);
                }
            }
        }
        System.out.print("Pay " + order.getTotalCost() + " units or Continue shipping? P/C");
        String proceed = READER.readLine();
        if (proceed.equalsIgnoreCase("P")) {
            if (strategy.pay(order.getTotalCost())) {
                System.out.println("Payment has been successful.");
            } else {
                System.out.println("FAIL! Please, check your data.");
            }
        }
        order.setClosed(order.isClosed());

    }
}
