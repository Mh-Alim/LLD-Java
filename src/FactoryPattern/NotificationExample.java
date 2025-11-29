package FactoryPattern;

interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[email notification sending...] "+message);
    }
}

class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[sms notification sending...] "+message);
    }
}

class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[push notification sending...] "+message);
    }
}


enum NotificationType {
    EMAIL,
    SMS,
    PUSH_NOTIFICATION,
}
class NotificatinFactory {
    public static Notification createNotification(NotificationType type) {
        if(type == NotificationType.EMAIL){
            return new EmailNotification();
        }
        else if(type == NotificationType.SMS){
            return new SmsNotification();
        }
        else if(type == NotificationType.PUSH_NOTIFICATION){
            return new PushNotification();
        }
        return null;
    }
}
public class NotificationExample {
    public static void main(String[] args) {
        Notification emailNotification = NotificatinFactory.createNotification(NotificationType.EMAIL);
        Notification smsNotification = NotificatinFactory.createNotification(NotificationType.SMS);
        Notification pushNotification = NotificatinFactory.createNotification(NotificationType.PUSH_NOTIFICATION);

        emailNotification.send("you won the price");
        smsNotification.send("you won the price");
        pushNotification.send("you won the price");
    }
}
