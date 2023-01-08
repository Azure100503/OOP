package patterns.creational.abstractfactory.furniture;

public class VictorianFactory extends FurnitureAbstractFactory{
    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
