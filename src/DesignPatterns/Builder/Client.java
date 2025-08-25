package DesignPatterns.Builder;

public class Client
{
    public static void main(String[] args)
    {
        // Way 1: Parameters inside a constructor
        // Way 2: Using Setters
        // Way 3: Use a map

        // Way 4: Use a Helper/Builder class
        SoldItemBuilder soldItemBuilder = new SoldItemBuilder();
        soldItemBuilder.setId(1);
        soldItemBuilder.setName("Sold Item");
        soldItemBuilder.setPrice(23.4);
        soldItemBuilder.setDiscount(0.2);
        soldItemBuilder.setQuantity(10);
        soldItemBuilder.setAvailable(true);
        soldItemBuilder.setWeight(89.34);

        SoldItem soldItem = new SoldItem(soldItemBuilder);
    }
}
