package org.tnova.media_player;

public class MP3Player implements MediaPlayer {

    @Override
    public String play() {
        return "Playing MP3 file...";
    }

    @Override
    public String stop() {
        return "Stopping MP3 file...";
    }

    @Override
    public int setVolume(int volume) {
        return volume;
    }
}
