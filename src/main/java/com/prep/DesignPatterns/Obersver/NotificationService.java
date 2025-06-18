package com.prep.DesignPatterns.Obersver;

public class NotificationService implements Observer{

    NotificationService() {
        Amazon amazon = Amazon.getInstance();
        amazon.registerObserver(this);
    }

    @Override
    public void notifyMe() {
        System.out.println("Notification Service: You have a new notification!");
    }
}

