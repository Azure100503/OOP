package src.convertradix;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radix: ");
        int radix = in.nextInt();

        System.out.print("Enter the string: ");
        String inStr = in.next();

        if (isValidInput(radix, inStr)) {
            System.out.print("The equivalent decimal number\" " + inStr + "\" is: " + convertRadixNToDec(radix, inStr));

        }
    }

    public static int convertRadixNToDec(int inRadix, String number) {
        String HEX_STRING = "0123456789ABCDEF";
        int dec = 0;
        for (int idx = 0; idx < number.length(); idx++) {
            dec = dec * inRadix + HEX_STRING.indexOf(number.toUpperCase().charAt(idx));
        }
        return dec;
    }

    public static boolean isValidInput(int radix, String str) {
        if (radix < 2 || radix > 16) {
            return false;
        }
        for (int idx = 0; idx <= str.length() - 1; idx++) {
            if (!(str.codePointAt(idx) >= '0' && str.codePointAt(idx) <= '9'
                    || str.codePointAt(idx) >= 'A' && str.codePointAt(idx) <= 'F'
                    || str.codePointAt(idx) >= 'a' && str.codePointAt(idx) <= 'f')) {
                return false;
            }
        }
        return true;
    }
}
