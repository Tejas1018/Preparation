package com.prep.DesignPatterns.Stratergy.QuackBehaviour;

public class SuperQuackBehaviour implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I can quack super loudly");
    }
}
