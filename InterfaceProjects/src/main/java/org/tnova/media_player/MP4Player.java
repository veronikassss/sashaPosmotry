package org.tnova.media_player;

public class MP4Player implements MediaPlayer {

    @Override
    public String play() {
        return "Playing MP4 file...";
    }

    @Override
    public String stop() {
        return "Stopping MP4 file...";
    }

    @Override
    public int setVolume(int volume) {
        return volume;
    }
}
