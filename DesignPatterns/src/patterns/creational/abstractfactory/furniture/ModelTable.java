package patterns.creational.abstractfactory.furniture;

public class ModelTable implements Table{
    @Override
    public void automatic() {
        System.out.println("This table is automatic");
    }
}
