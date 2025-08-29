package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.AndroidButton;
import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.button.IOSButton;
import DesignPatterns.Factory.components.dropdown.AndroidDropdown;
import DesignPatterns.Factory.components.dropdown.Dropdown;
import DesignPatterns.Factory.components.dropdown.IOSDropdown;

public class Client
{
    public static void main(String[] args)
    {
        Platform p = new IOS();
        UIComponentFactory uiComponentFactory
                = p.getUIComponentFactory();

        Button button = uiComponentFactory.createButton();
        Dropdown dropdown = uiComponentFactory.createDropdown();

        button.click();
        dropdown.showOptions();
    }
}
