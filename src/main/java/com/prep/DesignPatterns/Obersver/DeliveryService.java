package com.prep.DesignPatterns.Obersver;

public class DeliveryService implements Observer{

    DeliveryService(){
        Amazon amazon = Amazon.getInstance();
        amazon.registerObserver(this);
    }
    @Override
    public void notifyMe() {
        System.out.println("Delivery Service: Your order has been shipped!");
    }
}
