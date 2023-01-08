package src.calculation;

public class MyMath {
    public MyMath(){}

    public double cos(double x) {
        double cos = 1;
        double tmp = 1;
        for (int i = 1; i < 30; i ++) {
            tmp *= (- x * x) /((2 * i - 1) * (2 * i));
            cos += tmp;
        }
        return cos;
    }

    public double exp(double x) {
        double exp = 1;
        double tmp = 1;
        for (int i = 1; i < 30; i++) {
            tmp *= x / i;
            exp += tmp;
        }
        return exp;
    }
}
