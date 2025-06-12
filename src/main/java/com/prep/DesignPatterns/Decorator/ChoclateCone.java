package com.prep.DesignPatterns.Decorator;

//Choclate cone acts as both base cone as well as AddOn
public class ChoclateCone implements  IceCream{
    IceCream iceCream;
    ChoclateCone(){

    }
    ChoclateCone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + " " + "Choclate cone";
        }
        return "Choclate cone";
    }


}
