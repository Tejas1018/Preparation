package com.prep.DesignPatterns.factory;

import com.prep.DesignPatterns.factory.components.Button.Button;
import com.prep.DesignPatterns.factory.components.Button.WindowsButton;
import com.prep.DesignPatterns.factory.components.Menu.Menu;
import com.prep.DesignPatterns.factory.components.Menu.WindowsMenu;

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
