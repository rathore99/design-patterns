package org.example.design.patterns.factory;

class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null) return null;
        Notification notification;
        switch (type.toLowerCase()) {
            case "sms" : return new SMSNotification();
            case "email": return new EmailNotification();
            case "push" : return new PushNotification();
            default : throw new IllegalArgumentException("Unknown type " + type);
        }
    }
}
