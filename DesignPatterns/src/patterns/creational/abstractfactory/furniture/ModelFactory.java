package patterns.creational.abstractfactory.furniture;

public class ModelFactory extends FurnitureAbstractFactory{
    @Override
    public Table createTable() {
        return new ModelTable();
    }

    @Override
    public Chair createChair() {
        return new ModelChair();
    }
}
