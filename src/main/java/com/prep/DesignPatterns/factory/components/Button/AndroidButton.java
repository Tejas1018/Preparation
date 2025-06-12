package com.prep.DesignPatterns.factory.components.Button;

public class AndroidButton implements Button {

    @Override
    public void createButton() {
        System.out.println("Android Button");
    }
}
