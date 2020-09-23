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
        TaxCalculator calculator2019 = new TaxCalculator2019(100_000);
        TaxReport report2019 = new TaxReport();

        report2019.show(calculator2019);
        System.out.println(report2019.getTax());

        /*var str = new Strings();
        str.setText(new char[]{'A','B'});
        System.out.println(str.getText());
        System.out.println(str.upperCase());*/

    }

    public static void show (UIControl uicontrol) {
        uicontrol.render();
    }

}
