package patterns.behavioral.itorator.product;

public class ProductCatalog implements Iterable{
    private String[] productCatalog;
    private final int SIZE = 100;

    private int length; //length -> size - 1 : null

    public ProductCatalog() {
        this.productCatalog = new String[SIZE];
        this.length = -1;
    }


    @Override
    public Iterator getIterator() {
        return new ProductIterator(productCatalog,length);
    }

    public ProductCatalog add(String product) {
        if (this.length == this.productCatalog.length) {
            return this;
        }
        this.productCatalog[length + 1] = product;
        this.length ++;
        return this;
    }




}
