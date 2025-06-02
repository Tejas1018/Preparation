package com.prep.DesignPatterns.factory.components.Button;

public class IosButton implements Button {
    @Override
    public void createButton() {
        System.out.println("IOS Button");
    }
}
