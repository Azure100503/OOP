package patterns.creational.factorymethod.fruit;

public class Orange implements Fruit{
    @Override
    public void produceJuice() {
        System.out.println("Orange juice");
    }
}
