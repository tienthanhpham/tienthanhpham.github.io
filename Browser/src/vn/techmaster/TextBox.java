package vn.techmaster;

import vn.techmaster2.UIControl;

public class TextBox extends UIControl {
    private String text;

    @Override
    public void display() {
        System.out.println("Hien thi TextBox");
    }
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

    public void printText() {
        System.out.println(text);
    }
}
