package com.LLD.DesignPatterns.factory;

import com.LLD.DesignPatterns.factory.components.Button.Button;
import com.LLD.DesignPatterns.factory.components.Button.WindowsButton;
import com.LLD.DesignPatterns.factory.components.Menu.Menu;
import com.LLD.DesignPatterns.factory.components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button clickButton() {
        return new WindowsButton();
    }

    @Override
    public Menu clickOnMenu() {
        return new WindowsMenu();
    }
}
