package vn.techmaster;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var ticket = new TicketNumber();
        var lottery = new LotteryNumber();
        var lotteryAward = new LotteryAward();
        var award = lotteryAward.calAward(ticket, lottery);
        System.out.println(lottery.getLottery());
        System.out.println(award);

    }
}
