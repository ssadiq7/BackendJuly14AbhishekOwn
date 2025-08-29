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
        Platform p = new Android();
        Button button;
        Dropdown dropdown;
        if(p instanceof Android)
        {
            button = new AndroidButton();
        }else if (p instanceof IOS)
        {
            button = new IOSButton();
        }else {
            throw new IllegalArgumentException("Platform type not supported");
        }

        if(p instanceof Android)
        {
            dropdown = new AndroidDropdown();
        }else if (p instanceof IOS)
        {
            dropdown = new IOSDropdown();
        }else {
            throw new IllegalArgumentException("Platform type not supported");
        }

        button.click();
        dropdown.showOptions();

        // HW: Move this logic to other class, and implement Simple Factory
    }
}
