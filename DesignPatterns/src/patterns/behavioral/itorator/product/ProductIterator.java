package patterns.behavioral.itorator.product;

public class ProductIterator implements Iterator{
    private String[] productCatalog;
    private int length;
    private int currentPosition = 0;

    public ProductIterator(String[] productCatalog, int length ) {
        this.productCatalog = productCatalog;
        this.length = length;

    }

    @Override
    public boolean hasNext() {
        return (this.currentPosition <= length - 1
                && this.currentPosition < this.productCatalog.length - 1
        );
    }

    @Override
    public Object next() {
//    return current element
        return this.productCatalog[currentPosition ++];

//        OR
//        String currentProduct = productCatalog[currentPosition];
//        currentPosition ++;
//        return currentProduct;
    }
}
