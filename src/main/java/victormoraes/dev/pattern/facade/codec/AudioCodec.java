package victormoraes.dev.pattern.facade.codec;

public class AudioCodec implements Codec {
    @Override
    public void decode(String file) {
        System.out.printf("Decoding audio file %s", file);
        System.out.println();
    }
}
