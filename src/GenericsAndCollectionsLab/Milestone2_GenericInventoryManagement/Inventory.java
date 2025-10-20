package GenericsAndCollectionsLab.Milestone2_GenericInventoryManagement;

import GenericsAndCollectionsLab.Milestone1_ItemClassHierarchy.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory<T extends Item> {

    private Map<String, T> items; // id is the key

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(T item) {
        items.put(item.getId(), item);
    } // Add an item to the inventory.

    public void removeItem(String id) {
        items.remove(id);
    } // Remove an item by id.

    public T getItem(String id) {
        return items.get(id);
    } // Retrieve an item by id.

//    public Map<String, T> getAllItems() {
//        return items;
//    } // Return all items as a Collection<T>.
    public List<T> getAllItems() {
        return new ArrayList<>(items.values());
    } // Return all items as a Collection<T>.

    public List<String> getAllItemsByName() {
        List<String> itemNames = new ArrayList<>();
        for(Item item : items.values()) {
            itemNames.add(item.getName());
        }
        return itemNames;
    }

}
