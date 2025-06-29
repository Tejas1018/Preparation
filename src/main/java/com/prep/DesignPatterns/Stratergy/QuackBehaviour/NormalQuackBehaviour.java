package com.prep.DesignPatterns.Stratergy.QuackBehaviour;

public class NormalQuackBehaviour implements IQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I can quack normally");
    }
}
