package GenericsAndCollectionsLab.Milestone1_ItemClassHierarchy;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Electronics electronics = new Electronics("1", "Iron Box", 500, 2, 24);
        Clothing clothing = new Clothing("2", "Jeans", 999, 1, "XL");
        Book book = new Book("3", "Sherlock Homes", 256, 1, "Don't know");

        List<Item> items = new ArrayList<Item>();
        items.add(electronics);
        items.add(clothing);
        items.add(book);

        Collections.sort(items);

        for (Item item : items) {
            System.out.println(item.getName());
        }

    }

}
