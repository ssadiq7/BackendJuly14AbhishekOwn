package inventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();

        items.add(new Electronics("E1", "Laptop", 5 , 999.99, 24));
        items.add(new Clothing("C1", "T-Shirt", 100 ,19.99, "M"));
        items.add(new Book("B1", "Java Programming", 50, 59.99, "John Doe"));

        System.out.println("Items List : ");
        for (Item item : items) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }

        Collections.sort(items);
        System.out.println("Sorted items List based on quantity: ");
        for (Item item : items) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }

    }
}
