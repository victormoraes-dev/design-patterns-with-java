package victormoraes.dev.pattern.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


class MultimediaFacadeTest {

    @Test
    void testPlayAudio() {
        MultimediaFacade multimediaFacade = new MultimediaFacade();
        assertDoesNotThrow(() -> multimediaFacade.playAudio("audio.mp3"));
    }

    @Test
    void testPlayVideo() {
        MultimediaFacade multimediaFacade = new MultimediaFacade();
        assertDoesNotThrow(() -> multimediaFacade.playVideo("video.mp4"));
    }
}