package com.prep.DesignPatterns.Decorator;

public class orangeCone implements IceCream{
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
    //OrangeCone will always acts as base class

}
