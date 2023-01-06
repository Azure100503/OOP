package patterns.behavioral.strategy.calculation;

public class App {
    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println(context.executeStrategy(2,3));

        Context context1 = new Context(new Subtraction());
        System.out.println(context1.executeStrategy(2,3));

        Context context2 = new Context(new Multiplication());
        System.out.println(context2.executeStrategy(2,3));
    }

}
