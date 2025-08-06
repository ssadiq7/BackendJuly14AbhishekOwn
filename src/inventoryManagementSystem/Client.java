package inventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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

        System.out.println("**************************************************");
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.addItem(new Electronics("E1", "Laptop",5 ,  999.99 , 24));
        electronicsInventory.addItem(new Electronics("E2", "Laptop",5 ,  999.99 , 24));
        electronicsInventory.addItem(new Electronics("E3", "Mobile",5, 99.99, 24));

        List<Electronics> electronicsList = electronicsInventory.getAllItems();
        for(Electronics electronics: electronicsList)
        {
            System.out.println(electronics.getName());
        }

        System.out.println("**************************************************");

        Item item2 = new Electronics("E2", "Mobile", 5 , 999.99, 24);
        Item item3 = new Electronics("E3", "Watch", 5 , 999.99, 24);
        Item item4 = new Electronics("E4", "Ipad", 5 , 999.99, 24);
        Item item5 = new Electronics("E5", "Speaker", 5 , 999.99, 24);
        Item item6 = new Book("B1", "Java Programming", 50, 59.99, "John Doe");
        Item item7 = new Book("B2", "Python Programming", 50, 59.99, "Jane Doe");


        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();

        recentlyViewedItems.addRecentlyViewedItem(item3);
        recentlyViewedItems.addRecentlyViewedItem(item2);
        recentlyViewedItems.addRecentlyViewedItem(item5);
        recentlyViewedItems.addRecentlyViewedItem(item2);
        recentlyViewedItems.addRecentlyViewedItem(item5);
        recentlyViewedItems.addRecentlyViewedItem(item4);
        recentlyViewedItems.addRecentlyViewedItem(item6);
        recentlyViewedItems.addRecentlyViewedItem(item7);

        List<Item> recentlyViewedItemsList = recentlyViewedItems.getItemsList();
        for (Item item : recentlyViewedItemsList)
        {
            System.out.println(item.getName());
        }

        System.out.println("**************************************************");
        Order order1 = new Order("1", true);
        Order order2 = new Order("2", false);
        Order order3 = new Order("3", false);
        Order order4 = new Order("4", true);
        Order order5 = new Order("5", true);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(order1);
        orderProcessor.addOrder(order2);
        orderProcessor.addOrder(order3);
        orderProcessor.addOrder(order4);
        orderProcessor.addOrder(order5);

        while (orderProcessor.getSize() > 0)
        {
            orderProcessor.processOrder();
        }

        System.out.println("**************************************************");

        Collections.sort(items, new ItemSortByPriceComparator());
        System.out.println("Sorted items List based on decreasing prices: ");
        for (Item item : items) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }

    }
}
