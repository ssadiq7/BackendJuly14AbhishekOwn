package DesignPatterns.Factory.components.dropdown;

public class AndroidDropdown implements Dropdown{
    @Override
    public void showOptions() {
        System.out.println("Android Dropdown");
    }
}
