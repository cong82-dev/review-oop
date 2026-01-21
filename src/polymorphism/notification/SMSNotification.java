package polymorphism.notification;

public class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Send SMS" + message);
    }
    
}
