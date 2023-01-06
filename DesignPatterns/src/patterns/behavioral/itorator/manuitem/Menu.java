package patterns.behavioral.itorator.manuitem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Item> menuItem = new ArrayList<>();

    public void addItem(Item item) {
        menuItem.add(item);
    }
    public ItemIterator<Item> iterator() {
        return new MenuItemIterator();
    }

    class MenuItemIterator implements ItemIterator<Item> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < menuItem.size();
        }

        @Override
        public Item next() {
            return menuItem.get(currentIndex++);
        }
    }
}
