package patterns.behavioral.itorator.cafe;

public class DinerMenuIterator implements Iterator{
    private String[] items;
    private int position = 0;

    public DinerMenuIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public String next() {
        String menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
