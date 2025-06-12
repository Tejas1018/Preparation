package com.prep.DesignPatterns.Decorator;

public class VannilaScoop implements IceCream{
    IceCream iceCream;
    VannilaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " " +"Vanilla scoop";
    }
}
