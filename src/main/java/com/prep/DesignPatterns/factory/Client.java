package com.LLD.DesignPatterns.factory;

import com.LLD.DesignPatterns.factory.components.Button.Button;
import com.LLD.DesignPatterns.factory.components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.WINDOWS);

        Button button = uiFactory.clickButton();
        button.createButton();
        Menu menu = uiFactory.clickOnMenu();
        menu.showMenu();
    }
}
