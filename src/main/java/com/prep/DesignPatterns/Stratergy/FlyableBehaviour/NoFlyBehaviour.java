package com.prep.DesignPatterns.Stratergy.FlyableBehaviour;

public class NoFlyBehaviour implements FlayableBehaviour{
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
