package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        //VideoProcessor(VideoEncoder encode, VideoDatabase database, EmailService emailService)
        var processor = new VideoProcessor(new VideoEncoderH265(), new MongoVideoDatabase(), new GMailEmailService());
        processor.process(video);
    }
}
