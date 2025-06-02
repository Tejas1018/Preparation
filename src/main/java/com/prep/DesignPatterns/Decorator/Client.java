package com.prep.DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream =    new chocoChips(
                new strawberryScoop(new VannilaScoop(new orangeCone())));
        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}
