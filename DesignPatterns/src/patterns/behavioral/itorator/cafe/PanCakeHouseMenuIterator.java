package patterns.behavioral.itorator.cafe;

import java.util.ArrayList;
import java.util.List;

public class PanCakeHouseMenuIterator implements Iterator{
    private List<String> items;
    private int position = 0;

    public PanCakeHouseMenuIterator(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        String menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}
