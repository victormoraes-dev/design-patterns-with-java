package victormoraes.dev.pattern.facade.codec;

public class CodecFactory {
    public static Codec getAudioCodec(String file) {
        System.out.printf("Getting audio codec instance for file %s", file);
        System.out.println();
        return new AudioCodec();
    }

    public static Codec getVideoCodec(String file) {
        System.out.printf("Getting video codec instance for file %s", file);
        System.out.println();
        return new VideoCodec();
    }
}

