package vn.techmaster.reservation;

import java.sql.SQLOutput;

public class Bank {
    public static boolean settlement(Card card, int payment) {
       if (card.isEligible() == false) {
           System.out.println("Card not eligible!");
           return false;
       }
       if (card.getBalance() < payment) {
           System.out.println("Balance not enough!");
           return false;
       }
       return true;
    }
}
