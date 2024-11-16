package org.tnova.notification_system;

public class SMSNotification implements Notification {

    @Override
    public String send(String message) {
        return "the sms \"" + message + "\"" + " has been sent";
    }
}
