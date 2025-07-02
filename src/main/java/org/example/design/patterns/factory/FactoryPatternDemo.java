package org.example.design.patterns.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("sms");
        notification.notifyUser();

        notification = NotificationFactory.createNotification("email");
        notification.notifyUser();
    }
}
