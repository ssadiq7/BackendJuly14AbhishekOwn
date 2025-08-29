package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.Dropdown;

public abstract class Platform
{
    public void setRefresh()
    {
        System.out.println("Platform set refresh");
    }

    public abstract UIComponentFactory getUIComponentFactory();
}
