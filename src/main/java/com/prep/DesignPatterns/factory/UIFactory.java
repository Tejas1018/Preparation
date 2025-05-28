package com.LLD.DesignPatterns.factory;

import com.LLD.DesignPatterns.factory.components.Button.Button;
import com.LLD.DesignPatterns.factory.components.Menu.Menu;

public interface UIFactory {

    //Factory Methods
    Button clickButton();
    Menu clickOnMenu();
}
