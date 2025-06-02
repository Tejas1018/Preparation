package com.prep.DesignPatterns.factory;

import com.prep.DesignPatterns.factory.components.Button.Button;
import com.prep.DesignPatterns.factory.components.Button.IosButton;
import com.prep.DesignPatterns.factory.components.Menu.IosMenu;
import com.prep.DesignPatterns.factory.components.Menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button clickButton() {
        return new IosButton();
    }

    @Override
    public Menu clickOnMenu() {
        return new IosMenu();
    }
}
