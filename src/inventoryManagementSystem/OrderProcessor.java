package inventoryManagementSystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor
{
    private Queue<Order> orders;

    public OrderProcessor()
    {
        orders = new PriorityQueue<>();
    }

    public void addOrder(Order order)
    {
        orders.add(order);
    }

    public void processOrder()
    {
        Order order = orders.poll();
        System.out.println("Order processed with Id " + order.getOrderID());
    }

    public int getSize()
    {
        return orders.size();
    }
}
