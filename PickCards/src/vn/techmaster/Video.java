package vn.techmaster;

public class Video {
    private String fileName;
    private String title;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Video(String fileName, String title) {
        this.fileName = fileName;
        this.title = title;
    }
}
