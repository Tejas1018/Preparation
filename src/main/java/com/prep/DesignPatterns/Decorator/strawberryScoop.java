package com.prep.DesignPatterns.Decorator;

public class strawberryScoop implements IceCream{
    IceCream iceCream;
    strawberryScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return 40;
    }

    @Override
    public String getDescription() {
        return "Strawberry Icecream";
    }
}
