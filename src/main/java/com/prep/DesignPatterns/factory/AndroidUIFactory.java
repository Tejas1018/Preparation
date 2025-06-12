package com.prep.DesignPatterns.factory;

import com.prep.DesignPatterns.factory.components.Button.AndroidButton;
import com.prep.DesignPatterns.factory.components.Button.Button;
import com.prep.DesignPatterns.factory.components.Menu.AndroidMenu;
import com.prep.DesignPatterns.factory.components.Menu.Menu;

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
