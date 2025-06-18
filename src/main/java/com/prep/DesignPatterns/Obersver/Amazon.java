package com.prep.DesignPatterns.Obersver;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private static Amazon instance = null;

    private Amazon(){
        //private constructor to prevent instantiation
    }
    static Amazon getInstance(){
        if(instance == null){
            instance = new Amazon();
        }
        return instance;
    }
    List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void unregister(Observer observer){
        observers.remove(observer);
    }

    public void notiyObserver(){
        for(Observer observer : observers){
            observer.notifyMe();
        }
    }
}
