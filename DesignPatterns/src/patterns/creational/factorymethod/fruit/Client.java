package patterns.creational.factorymethod.fruit;

public class Client {
    public static void main(String[] args) {
        FruitFactory factory = FruitFactory.getInstance();
        Fruit apple = factory.produceFruit("Apple");
        apple.produceJuice();

    }
}
