package DesignPatterns.Decorator.AddOn;

import DesignPatterns.Decorator.Beverage.Beverage;

public abstract class AddOn extends Beverage
{
    protected Beverage beverage;
    public AddOn(Beverage beverage)
    {
        this.beverage = beverage;
    }
}
