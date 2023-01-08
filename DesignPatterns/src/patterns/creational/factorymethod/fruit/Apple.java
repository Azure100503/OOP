package patterns.creational.factorymethod.fruit;

public class Apple implements Fruit{
    @Override
    public void produceJuice() {
        System.out.println("Apple juice");
    }
}
