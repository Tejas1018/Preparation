package com.prep.DesignPatterns.Stratergy;


import com.prep.DesignPatterns.Stratergy.FlyableBehaviour.FlayableBehaviour;
import com.prep.DesignPatterns.Stratergy.QuackBehaviour.IQuackBehaviour;

public abstract class Duck {
    FlayableBehaviour flyBehaviour;
    IQuackBehaviour quackBehaviour;

    public Duck(FlayableBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }
    public void performFly() {
        flyBehaviour.fly();
    }
    public void performQuack() {
        quackBehaviour.quack();
    }
}
