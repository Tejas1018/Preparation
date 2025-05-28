package com.LLD.DesignPatterns.Decorator;

public class chocoChips implements IceCream{
    IceCream iceCream;
    chocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream.getCost() != 0){
            return iceCream.getCost() + 10;
        }
        return 10;
    }

    @Override
    public String getDescription() {
        if(iceCream.getDescription() != ""){
            return iceCream.getDescription() + " " + "ChocoChips";
        }
        return "ChocoChips";
    }
}
