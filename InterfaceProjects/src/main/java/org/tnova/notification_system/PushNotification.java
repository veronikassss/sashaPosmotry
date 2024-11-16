package org.tnova.notification_system;

public class PushNotification implements Notification {

    @Override
    public String send(String message) {
        return "the push \"" + message + "\"" + " has been sent";
    }
}
