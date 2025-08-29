package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;

public abstract class Platform
{
    public void setRefresh()
    {
        System.out.println("Platform set refresh");
    }

    public abstract Button createButton();
}
