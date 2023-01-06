package patterns.behavioral.itorator.cafe;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    private List<String> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<String>();

        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    public void addItem(String name) {
        menuItems.add(name);
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public String toString() {
        return "Pancake House Menu";
    }

    @Override
    public Iterator createIterator() {
        return new PanCakeHouseMenuIterator((ArrayList<String>) menuItems);
    }
}
