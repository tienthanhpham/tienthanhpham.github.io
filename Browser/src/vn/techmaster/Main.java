package vn.techmaster;
import vn.techmaster2.UIControl;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var textBox = new TextBox("abc");
        var uiControl = new UIControl(true);
        textBox.display();
        uiControl.display();
    }
}
