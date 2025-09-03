package DesignPatterns.Decorator.Beverage;

public class DarkRoast extends Beverage
{

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public void printDescription() {
        System.out.println("Dark Roast");
    }
}
