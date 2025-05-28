package com.LLD.DesignPatterns.factory;

import com.LLD.DesignPatterns.factory.components.Button.Button;
import com.LLD.DesignPatterns.factory.components.Button.IosButton;
import com.LLD.DesignPatterns.factory.components.Menu.IosMenu;
import com.LLD.DesignPatterns.factory.components.Menu.Menu;

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
