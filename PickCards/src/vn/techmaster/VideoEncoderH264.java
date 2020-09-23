package vn.techmaster;

public class VideoEncoderH264 implements VideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println("Encode done!");
    }
}
