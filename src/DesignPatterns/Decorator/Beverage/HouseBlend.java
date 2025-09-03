package DesignPatterns.Decorator.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public void printDescription() {
        System.out.println("House Blend");
    }
}
