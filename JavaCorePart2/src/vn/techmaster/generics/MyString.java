package vn.techmaster.generics;

public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String toUpperCase() {
        char[] newStr = this.str.toCharArray();
        for (int i = 0; i < newStr.length; i++)
            newStr[i] = (char)((int)newStr[i] - 32);
        return String.valueOf(newStr);
    }
}
