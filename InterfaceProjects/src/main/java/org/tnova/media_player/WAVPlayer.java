package org.tnova.media_player;

public class WAVPlayer implements MediaPlayer {

    @Override
    public String play() {
        return "Playing WAV file...";
    }

    @Override
    public String stop() {
        return "Stopping WAV file...";
    }

    @Override
    public int setVolume(int volume) {
        return volume;
    }
}
