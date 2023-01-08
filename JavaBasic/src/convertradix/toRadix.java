package src.convertradix;

public class toRadix {
    public static String toDecimal(String number, int inRadix) {
        String HEX_STRING = "0123456789ABCDEF";
        int dec = 0;
        for (int idx = 0; idx < number.length(); idx++) {
            dec = dec * inRadix + HEX_STRING.indexOf(number.toUpperCase().charAt(idx));
        }
        String decString = String.valueOf(dec);
        return decString;
    }

    public static String decimalTo(String number, int outRadix) {
        String hexStr = "0123456789ABCDEF";
        StringBuilder out = new StringBuilder(" ");
        int decimal = Integer.parseInt(String.valueOf(number));
        int remainder;
        while (decimal != 0) {
            remainder = decimal % outRadix;
            out.append(hexStr.charAt(remainder));
            decimal /= outRadix;
        }
        return out.toString();
    }

    public static String toRadix(String number, int inRadix, int outRadix) {
        return decimalTo(toDecimal(number, inRadix), outRadix);
    }

    public static void main(String[] args) {
        System.out.println(toRadix("123", 10, 2));
    }
}
