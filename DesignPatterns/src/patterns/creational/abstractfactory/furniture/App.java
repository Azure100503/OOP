package patterns.creational.abstractfactory.furniture;

public class App {
    public static void main(String[] args) {
        FurnitureAbstractFactory modelFactory = new ModelFactory();
        modelFactory.createTable().automatic();
        modelFactory.createChair().lie();
        modelFactory.createChair().fold();




    }
}
