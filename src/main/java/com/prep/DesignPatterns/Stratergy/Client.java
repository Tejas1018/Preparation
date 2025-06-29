package com.prep.DesignPatterns.Stratergy;

public class Client {
    public static void main(String[] args) {
        Duck cityDuck = new CityDuck();
        System.out.println("City Duck:");
        cityDuck.performFly();
        cityDuck.performQuack();
        System.out.println("\n");
        System.out.println("Forest Duck:");
        Duck forestDuck = new ForestDuck();
        forestDuck.performFly();
        forestDuck.performQuack();
    }
}
