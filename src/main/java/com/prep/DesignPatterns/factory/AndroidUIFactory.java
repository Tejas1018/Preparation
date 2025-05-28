package com.LLD.DesignPatterns.factory;

import com.LLD.DesignPatterns.factory.components.Button.AndroidButton;
import com.LLD.DesignPatterns.factory.components.Button.Button;
import com.LLD.DesignPatterns.factory.components.Menu.AndroidMenu;
import com.LLD.DesignPatterns.factory.components.Menu.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public Button clickButton() {
        return new AndroidButton();
    }

    @Override
    public Menu clickOnMenu() {
        return new AndroidMenu();
    }
}
