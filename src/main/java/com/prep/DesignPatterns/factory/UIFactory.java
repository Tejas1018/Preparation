package com.prep.DesignPatterns.factory;

import com.prep.DesignPatterns.factory.components.Button.Button;
import com.prep.DesignPatterns.factory.components.Menu.Menu;

public interface UIFactory {

    //Factory Methods
    Button clickButton();
    Menu clickOnMenu();
}
