package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.Dropdown;

public interface UIComponentFactory
{
    Button createButton();
    Dropdown createDropdown();
//    Menu createMenu();
//    Calendar createCalendar();
}
