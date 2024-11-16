package org.tnova.media_player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MediaPlayer mp4 = new MP4Player();
        MediaPlayer mp3 = new MP3Player();
        MediaPlayer wav = new WAVPlayer();
        MediaPlayer avi = new AVIPlayer();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select media type to play: ");
        System.out.println("1. MP3\n" +  "2. MP4\n" + "3. WAV\n" + "4. AVI");

        int option = scanner.nextInt();

        String type = "";
        switch (option) {
            case 1:
                type = "MP3";
                break;
            case 2:
                type = "MP4";
                break;
            case 3:
                type = "WAV";
                break;
            case 4:
                type = "AVI";
            default:
                System.out.println("wrong");
        }

        System.out.println("You selected: " + option + " (" + type + ")" );

        MediaPlayer selected = null;

        switch (option) {
            case 1:
               selected = mp3;
                break;
            case 2:
               selected = mp4;
                break;
            case 3:
                selected = wav;
                break;
            case 4:
                selected = avi;
            default:
                System.out.println("we have only with option, choose one of this");

        }
        System.out.println("what level of volume do you want (up 0 to 100): ");
        int volume = scanner.nextInt();
        System.out.println("okay, the volume is " + selected.setVolume(volume));

        System.out.println(selected.play());
        System.out.println(selected.stop());
    }
}
