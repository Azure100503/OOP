package culculation;

public class Integral {
    public static double f(double x) {
        return Math.pow(Math.sin(x), 2) * Math.cos(x);
    }

    public static double calculateIntegral(double a, double b, int n) {
        double h, s;
        h = (b - a) / n;
        s = h * (f(a) + f(b)) / 2;
        for (int i = 1; i < n; i++) {
            s = s + h * f(a + i * h);
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 2;
        double a = 0;
        double b = Math.PI / 2;
        double delta = Math.pow(10, -6);
        double result = calculateIntegral(a, b, n);
        while (Math.abs(calculateIntegral(a, b, n) - calculateIntegral(a, b, 2 * n)) >= delta) {
            n *= 2;
            result = calculateIntegral(a, b, 2 * n);
        }
        System.out.println(result);
    }
}
