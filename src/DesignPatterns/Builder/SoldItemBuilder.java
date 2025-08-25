package DesignPatterns.Builder;

public class SoldItemBuilder
{
    private long id;
    private String name;
    private double price;
    private double discount;
    private int quantity;
    private boolean available;
    private double weight;

    public SoldItem build()
    {
        return new SoldItem(this);
    }

    public SoldItemBuilder setId(long id)
    {
        this.id = id;
        return this;
    }

    public SoldItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public SoldItemBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public SoldItemBuilder setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public SoldItemBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public SoldItemBuilder setAvailable(boolean available) {
        this.available = available;
        return this;
    }

    public SoldItemBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getWeight() {
        return weight;
    }
}
