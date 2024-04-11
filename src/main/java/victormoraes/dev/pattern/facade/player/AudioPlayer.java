package victormoraes.dev.pattern.facade.player;

import victormoraes.dev.pattern.facade.codec.Codec;
import victormoraes.dev.pattern.facade.codec.CodecFactory;

public class AudioPlayer {
    public void playAudio(String file) {
        Codec audioCodec = CodecFactory.getAudioCodec(file);
        audioCodec.decode(file);
        System.out.printf("Playing audio file %s", file);
        System.out.println();
    }
}
