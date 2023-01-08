package patterns.creational.factorymethod.fruit;

public class FruitFactory {
    public static FruitFactory instance;

    private FruitFactory() {
    }

    public static FruitFactory getInstance() {
        if (instance == null) {
            instance = new FruitFactory();
        }
        return instance;
    }

    public Fruit produceFruit(String type) {
        if (type.equals("Apple")) {
            return new Apple();
        } else if (type.equals("Banana")) {
            return new Banana();
        } else {
            return new Orange();
        }
    }
}
