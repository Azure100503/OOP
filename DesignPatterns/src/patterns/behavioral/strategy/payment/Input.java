package patterns.behavioral.strategy.payment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    private static BufferedReader reader;

    private Input() {
    }

    public static BufferedReader getReader() {
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }
        return reader;
    }
}
