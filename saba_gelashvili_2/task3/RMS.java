package midterm.saba_gelashvili_2.task3;

import java.util.ArrayList;
import java.util.List;

public class RMS {
    private List<MenuItem> menu = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public boolean removeMenuItem(MenuItem item) {
        return menu.remove(item);
    }

    public void printMenu() {
        System.out.println("==== Restaurant Menu ====");
        if (menu.isEmpty()) {
            System.out.println("The menu is empty.");
        } else {
            for (MenuItem item : menu) {
                System.out.println(item);
            }
        }
        System.out.println("========================");
    }
}