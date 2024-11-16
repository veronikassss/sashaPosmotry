package org.tnova.notification_system;

public class EmailNotification implements Notification {

    @Override
    public String send(String message) {
        return "the email \"" + message + "\"" + " has been sent";
    }
}
