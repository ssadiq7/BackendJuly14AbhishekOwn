package DesignPatterns.Builder;

public class Client
{
    public static void main(String[] args)
    {
        // Way 1: Parameters inside a constructor
        // Way 2: Using Setters
        // Way 3: Use a map

        // Way 4: Use a Helper/Builder class
        SoldItem soldItem
                = SoldItem
                .getBuilder()
                .setId(1)
                .setName("Sold Item")
                .setPrice(23.4)
                .setDiscount(0.2)
                .setQuantity(10)
                .setAvailable(true)
                .setWeight(238.90)
                .build();

//        SoldItemBuilder soldItemBuilder = SoldItem.getBuilder();
//        SoldItem soldItem1 = new SoldItem(soldItemBuilder);
    }
}
