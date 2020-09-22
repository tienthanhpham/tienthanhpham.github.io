package vn.techmaster;

public final class Strings {
    private char[] text;

    public char[] getText() {
        return text;
    }

    public void setText(char[] text) {
        this.text = text;
    }

    public char[] upperCase() {
        char[] text2 = new char[10];
        int y;
        for (int i = 0; i < text.length; i++)
            text2[i] = (char) ((int)text[i] + 32);
        return text2;
    }
}
