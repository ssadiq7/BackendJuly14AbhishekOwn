package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.AndroidButton;
import DesignPatterns.Factory.components.button.Button;

public class Android extends Platform
{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
