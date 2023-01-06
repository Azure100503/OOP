package patterns.behavioral.strategy.payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy{
    private static Map<String, String> DATABASE = new HashMap<>();
    private  static BufferedReader READER;
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATABASE.put("amanda1985", "amada@ya.com");
        DATABASE.put("qwerty", "john@amazone.eu");

    }
    @Override
    public boolean pay(int payAmount) {
        if (signedIn) {
            System.out.println("Paying " + payAmount + " using PAyPal.");
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Enter the user's email: ");
                email = READER.readLine();
                System.out.println("Enter the password: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    private boolean verify() {
        setSignedIn(email.equals(DATABASE.get(password)));
        return signedIn;
    }
}
