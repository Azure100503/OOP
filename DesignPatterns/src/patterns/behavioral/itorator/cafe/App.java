package patterns.behavioral.itorator.cafe;

import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Without iterators
        System.out.println("BREAKFAST\n");
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<String> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            String menuItem = breakfastItems.get(i);
            System.out.println(menuItem);
        }

        System.out.println("DINER\n");
        DinerMenu dinerMenu = new DinerMenu();
        String[] dinerItems = dinerMenu.getMenuItems();
        for (int i = 0; i < dinerItems.length; i++) {
            String menuItem = dinerItems[i];
            System.out.println(menuItem);
        }

        // With iterators

        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("BREAKFAST with Iterators\n");
        printMenu(pancakeIterator);

        System.out.println("DINER with Iterators\n");
        printMenu(dinerIterator);



    }

    public static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            String menuItem = (String) iterator.next();
            System.out.println(menuItem);
        }
    }
}
