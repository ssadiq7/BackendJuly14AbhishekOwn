package DesignPatterns.Factory.components.dropdown;

public class IOSDropdown implements Dropdown{
    @Override
    public void showOptions() {
        System.out.println("iOS Dropdown");
    }
}
