package com.prep.DesignPatterns.Obersver;

public class Client {
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();
        amazon.notiyObserver();
        // Registering observers
        DeliveryService deliveryService = new DeliveryService();
        NotificationService notificationService = new NotificationService();
        InvoiceService invoiceService = new InvoiceService();
        // Notifying observers
        amazon.notiyObserver();
        // Unregistering an observer
        amazon.unregister(notificationService);
        // Notifying observers again
        amazon.notiyObserver();
        // Output:
        // Notification Service: You have a new notification!
    }
}
