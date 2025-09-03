package DesignPatterns.Decorator;

import DesignPatterns.Decorator.AddOn.ChocoChip;
import DesignPatterns.Decorator.AddOn.Mocha;
import DesignPatterns.Decorator.AddOn.Soy;
import DesignPatterns.Decorator.AddOn.Whip;
import DesignPatterns.Decorator.Beverage.Beverage;
import DesignPatterns.Decorator.Beverage.DarkRoast;
import DesignPatterns.Decorator.Beverage.Decaf;

public class Client
{
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage.printDescription();
        System.out.println(beverage.getPrice());

        System.out.println(" ******************* ");
        beverage = new ChocoChip(new Soy(new Whip(beverage)));
        beverage.printDescription();
        System.out.println(beverage.getPrice());

        /* Double Mocha Decaf with choco chip */
        System.out.println(" ******************************************* ");
        Beverage beverage2 = new Decaf();
        beverage2 = new Mocha(beverage2);
        beverage2 = new ChocoChip(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2.printDescription();
        System.out.println(beverage2.getPrice());

    }
}
