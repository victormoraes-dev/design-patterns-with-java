package victormoraes.dev.pattern.facade.player;

import victormoraes.dev.pattern.facade.codec.Codec;
import victormoraes.dev.pattern.facade.codec.CodecFactory;

public class VideoPlayer {
    public void playVideo(String file) {
        Codec videoCodec = CodecFactory.getVideoCodec(file);
        videoCodec.decode(file);
        System.out.printf("Playing video file %s", file);
        System.out.println();
    }
}
