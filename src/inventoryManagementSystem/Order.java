package inventoryManagementSystem;

public class Order implements Comparable<Order>
{
    private String orderID;
    private boolean isExpress;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    public Order(String orderID, boolean isExpress)
    {
        this.orderID = orderID;
        this.isExpress = isExpress;
    }

    @Override
    public int compareTo(Order o)
    {
        /*
        * this <=> Equal <=> Other
        * -1 <=> 0 <=> 1
        *
        * */
        if (this.isExpress)
        {
            return -1;
        }

        if (o.isExpress)
        {
            return 1;
        }
        return 0;
    }
}
