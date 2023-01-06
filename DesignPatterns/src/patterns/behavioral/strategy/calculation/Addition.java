package patterns.behavioral.strategy.calculation;

public class Addition implements CalculateStrategy{
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
