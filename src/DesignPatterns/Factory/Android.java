package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.AndroidButton;
import DesignPatterns.Factory.components.button.Button;

public class Android extends Platform
{
    @Override
    public UIComponentFactory getUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}
