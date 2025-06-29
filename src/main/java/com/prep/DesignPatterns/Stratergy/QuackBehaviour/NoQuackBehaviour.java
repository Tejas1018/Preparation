package com.prep.DesignPatterns.Stratergy.QuackBehaviour;

public class NoQuackBehaviour implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I cannot quack");
    }
}
