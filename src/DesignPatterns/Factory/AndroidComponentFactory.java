package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.AndroidButton;
import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.AndroidDropdown;
import DesignPatterns.Factory.components.dropdown.Dropdown;

public class AndroidComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
