package patterns.creational.abstractfactory.furniture;

public class ModelChair implements Chair{
    @Override
    public void fold() {
        System.out.println("You can fold this chair");
    }

    @Override
    public void lie() {
        System.out.println("You can lie on this chair");

    }
}
