package vn.techmaster;

public class TextBox extends UIControl implements Resizable{
    private String text;

    public TextBox(String text) {
        super(true);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void resize(int x) {

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
