package patterns.creational.abstractfactory.furniture;

public class VictorianTable implements Table{
    @Override
    public void automatic() {
        System.out.println("This table is not automatic");
    }
}
