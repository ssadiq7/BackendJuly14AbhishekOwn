package inventoryManagementSystem;

import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems
{
    private LinkedList<Item> itemsList;

    public LinkedList<Item> getItemsList()
    {
        return itemsList;
    }

    private int MAX_SIZE;

    public RecentlyViewedItems()
    {
        itemsList = new LinkedList<Item>();
        MAX_SIZE = 5;
    }

    public void addRecentlyViewedItem(Item item)
    {
        itemsList.remove(item);
        itemsList.add(item);

        if (itemsList.size() > MAX_SIZE)
        {
            itemsList.removeFirst();
        }
    }

    public void removeRecentlyViewedItem(Item item)
    {
        itemsList.remove(item);
    }

    public int getSize()
    {
        return itemsList.size();
    }
}
