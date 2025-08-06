package inventoryManagementSystem;

import java.util.Comparator;

public class ItemSortByPriceComparator implements Comparator<Item>
{
    @Override
    public int compare(Item o1, Item o2)
    {
        /*
        * o1 <=> equal <=> o2
        * -1 <=> 0 <=> 1
        *
        * */
        if (o1.getPrice() > o2.getPrice())
        {
            return -1;
        }

        if (o1.getPrice() < o2.getPrice())
        {
            return 1;
        }
        return 0;
    }
}
