package org.tnova.notification_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();

        Scanner scanner = new Scanner(System.in);

        System.out.println("write your message, please ");

        String message = scanner.nextLine();

        System.out.println("you want use one notification channel? ");

        String responce = scanner.nextLine();

        if (responce.equalsIgnoreCase("yes")) {
            System.out.println("choose notification channel:\n" + "1. email\n" + "2. sms\n" + "3. push");
            int option = scanner.nextInt();
            Notification selected = null;

            switch (option) {
                case 1:
                    selected = email;
                    break;
                case 2:
                    selected = sms;
                    break;
                case 3:
                    selected = push;
                    break;
                default:
                    System.out.println("sorry, we dont have such option");
            }
            System.out.println(selected.send(message));

        } else if (responce.equalsIgnoreCase("no")) {
            System.out.println("choose notification channel:\\n\" + \"1. email\\n\" + \"2. sms\\n\" + \"3. push\"");
            System.out.println("You can enter multiple choices separated by space, e.g., '1 2 3'");

            String input = scanner.nextLine();
            String[] userChoices = input.split(" ");

            for (String userChoise : userChoices) {

                int channel = Integer.parseInt(userChoise);

                List<Notification> notificationList = new ArrayList<>();

                if (channel == 1) {
                    notificationList.add(email);
                }

                if (channel == 2) {
                    notificationList.add(sms);
                }

                if (channel == 3) {
                    notificationList.add(push);
                }

                for (Notification note : notificationList) {
                    System.out.println(note.send(message));
                }
            }
        }
    }
}

