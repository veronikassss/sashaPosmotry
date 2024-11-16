package org.tnova.media_player;

public class AVIPlayer implements MediaPlayer {
    @Override
    public String play() {
        return "Playing AVI file...";
    }

    @Override
    public String stop() {
        return "Stopping AVI file...";
    }

    @Override
    public int setVolume(int volume) {
        return volume;
    }
}
