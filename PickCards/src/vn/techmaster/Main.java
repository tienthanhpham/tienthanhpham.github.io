package vn.techmaster;

import org.w3c.dom.Text;

import java.awt.*;
import java.security.cert.PolicyNode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*var cardNumber = new CardNumber();
        cardNumber.setNumber();
        var cardType = new CardType(cardNumber.getRandom());
        cardType.setCardType();
        System.out.println("Quan bai la " + cardNumber.getNumber() + " " + cardType.getCardType());
        */
       //var textBox = new TextBox();
       //var uiControl = new UIControl();
       //show(uiControl);
        var str = new Strings();
        str.setText(new char[]{'A','B'});
        System.out.println(str.getText());
        System.out.println(str.upperCase());
    }

    public static void show (UIControl uicontrol) {
        if (uicontrol instanceof TextBox) {
            var textBox = (TextBox) uicontrol;
            textBox.setText("Hello");
            }
        System.out.println(uicontrol);

    }

}
