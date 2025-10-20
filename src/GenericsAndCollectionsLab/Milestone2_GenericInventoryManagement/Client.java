package GenericsAndCollectionsLab.Milestone2_GenericInventoryManagement;

import GenericsAndCollectionsLab.Milestone1_ItemClassHierarchy.Book;
import GenericsAndCollectionsLab.Milestone1_ItemClassHierarchy.Clothing;
import GenericsAndCollectionsLab.Milestone1_ItemClassHierarchy.Electronics;
import GenericsAndCollectionsLab.Milestone1_ItemClassHierarchy.Item;

public class Client {

    public static void main(String[] args) {

        // Add, retrieve and remove items from the Inventory
        // Verify behavior when trying to add items with duplicate IDs.

        Item item1 = new Electronics("101", "phone", 60000, 1, 24);
        Item item2 = new Clothing("102", "laptop", 150000, 1, "XL");
        Item item3 = new Book("103", "Sherlock", 30000, 1, "Sherlock Homes");

        // Adding items
        Inventory inventory = new Inventory();
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);

        System.out.println("Retrieving all items after having added");
        System.out.println(inventory.getAllItems());

        System.out.println("\nRetrieving one item");
        System.out.println(inventory.getItem("101"));

        System.out.println("\nRemoving one item");
        inventory.removeItem("101");
        System.out.println(inventory.getAllItems());

        System.out.println("\nVerifying behavior when trying to add items with duplicate IDs.");
        inventory.addItem(item2);
        System.out.println(inventory.getAllItems());

        System.out.println(inventory.getAllItemsByName());

    }

}
