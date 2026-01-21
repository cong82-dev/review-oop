package polymorphism.notification;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Send Email" + message);
    }
    
}
