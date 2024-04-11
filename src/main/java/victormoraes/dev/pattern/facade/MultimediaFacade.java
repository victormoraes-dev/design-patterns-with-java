package victormoraes.dev.pattern.facade;

import victormoraes.dev.pattern.facade.player.AudioPlayer;
import victormoraes.dev.pattern.facade.player.VideoPlayer;

public class MultimediaFacade {
    private final AudioPlayer audioPlayer;
    private final VideoPlayer videoPlayer;

    public MultimediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
    }

    public void playAudio(String file) {
        audioPlayer.playAudio(file);
    }

    public void playVideo(String file) {
        videoPlayer.playVideo(file);
    }
}

