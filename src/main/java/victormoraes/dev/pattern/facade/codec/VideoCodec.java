package victormoraes.dev.pattern.facade.codec;

public class VideoCodec implements Codec {
    @Override
    public void decode(String file) {
        System.out.printf("Decoding video file %s", file);
        System.out.println();
    }
}
