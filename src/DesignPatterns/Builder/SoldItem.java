package DesignPatterns.Builder;

public class SoldItem
{
    private long id;
    private String name;
    private double price;
    private double discount;
    private int quantity;
    private boolean available;
    private double weight;

    public SoldItem(SoldItemBuilder builder)
    {
        this.id = builder.getId();
        this.name = builder.getName();
        this.price = builder.getPrice();
        this.discount = builder.getDiscount();
        this.quantity = builder.getQuantity();
        this.available = builder.isAvailable();
        this.weight = builder.getWeight();
    }

    public static SoldItemBuilder getBuilder()
    {
        return new SoldItemBuilder();
    }
}
