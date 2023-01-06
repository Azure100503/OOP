package patterns.behavioral.strategy.calculation;

public class Context {
    private CalculateStrategy strategy;

    public Context(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double a, double b) {
        return strategy.calculate(a,b);
    }
}
