package inventoryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory<T extends Item>
{
    Map<String, T> itemMap;
    public Inventory()
    {
        itemMap = new HashMap<>();
    }

    public void addItem(T item)
    {
        itemMap.put(item.getId(), item);
    }

    public void removeItem(T item)
    {
        itemMap.remove(item.getId());
    }

    public void getItem(String id)
    {
        itemMap.get(id);
    }

    public List<T> getAllItems()
    {
        return new ArrayList<>(itemMap.values());
    }
}
