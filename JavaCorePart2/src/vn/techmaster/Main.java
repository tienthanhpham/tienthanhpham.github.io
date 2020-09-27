package vn.techmaster;

import vn.techmaster.bank.CurrentAccount;
import vn.techmaster.bank.CurrentPlusAccount;
import vn.techmaster.bank.SavingsAccount;
import vn.techmaster.toller.Line;
import vn.techmaster.toller.OneWayTicket;
import vn.techmaster.toller.PrepaidCard;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
//        var oneWayTicket = new OneWayTicket(180);
//        var prepaidCard = new PrepaidCard(200);
//
//        Line.A.enter(oneWayTicket);
//        Line.B.exit(oneWayTicket);
//        System.out.println(oneWayTicket.toString());
//
//        Line.A.enter(prepaidCard);
//        Line.D.exit(prepaidCard);
//        System.out.println(oneWayTicket.toString());
        NumberFormat formatter = new DecimalFormat("#0");
        var savingsAccount = new SavingsAccount("SA", 100_000_000, 0.12);
        savingsAccount.withdraw(10_000_000);
        //System.out.println(formatter.format(savingsAccount.getBalance()));
        //System.out.println(formatter.format(savingsAccount.monthlyInterest()));

        var currentAccount = new CurrentAccount("CA", 100_000_000, 1000_000);
        currentAccount.clearCheck(10_000_000);
        //System.out.println(formatter.format(currentAccount.getBalance()));
        //System.out.println(formatter.format(currentAccount.monthlyInterest()));

        var currentPlusAccount = new CurrentPlusAccount("CPA", 100_000_000, 1000_000, 50_000_000, 0.12);
        currentPlusAccount.clearCheck(200_000_000);
        System.out.println(formatter.format(currentPlusAccount.getBalance()));
        System.out.println(formatter.format(currentPlusAccount.monthlyInterest()));
    }
}
