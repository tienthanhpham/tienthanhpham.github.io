package vn.techmaster;

public class VideoProcessor {
    public void process(Video video) {
        var encoder = new VideoEncoderH264();
        encoder.encode(video);
    }

}
