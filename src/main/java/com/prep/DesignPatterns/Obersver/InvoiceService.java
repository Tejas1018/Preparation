package com.prep.DesignPatterns.Obersver;

public class InvoiceService implements Observer{
    InvoiceService(){
        Amazon amazon = Amazon.getInstance();
        amazon.registerObserver(this);
    }
    @Override
    public void notifyMe() {
        System.out.println("Invoice Service: Your invoice has been generated!");
    }
}
