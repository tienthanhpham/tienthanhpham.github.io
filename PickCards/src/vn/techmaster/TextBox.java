package vn.techmaster;

public class TextBox extends UIControl {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");

    }

    @Override
    public String toString() {
        return text;
    }
}
