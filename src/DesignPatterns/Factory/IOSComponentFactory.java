package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.button.IOSButton;
import DesignPatterns.Factory.components.dropdown.Dropdown;
import DesignPatterns.Factory.components.dropdown.IOSDropdown;

public class IOSComponentFactory implements UIComponentFactory
{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
