package com.prep.DesignPatterns.Stratergy.FlyableBehaviour;

public class NormalFlyingBehaviour implements FlayableBehaviour
{
    @Override
    public void fly() {
        System.out.println("I can fly normally");
    }
}
