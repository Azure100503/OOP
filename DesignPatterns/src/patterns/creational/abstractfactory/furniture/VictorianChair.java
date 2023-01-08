package patterns.creational.abstractfactory.furniture;

public class VictorianChair implements Chair{
    @Override
    public void fold() {
        System.out.println("You cannot fold this chair");
    }

    @Override
    public void lie() {
        System.out.println("You cannot lie on this chair");

    }
}
