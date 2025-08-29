package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.button.IOSButton;

public class IOS extends Platform
{
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
