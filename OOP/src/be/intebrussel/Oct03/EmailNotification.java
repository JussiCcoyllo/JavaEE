package be.intebrussel.Oct03;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
