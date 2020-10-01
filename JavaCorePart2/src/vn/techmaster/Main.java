package vn.techmaster;

import vn.techmaster.highway.Line;
import vn.techmaster.highway.OneWayTicket;
import vn.techmaster.highway.Payable;
import vn.techmaster.highway.PrepaidCard;

public class Main {
    public static void main(String[] args) {
        Payable oneWayTicket = new OneWayTicket(150);
        Payable prepaidCard = new PrepaidCard(210);

        Line.A.enter(oneWayTicket);
        Line.C.exit(oneWayTicket);

        System.out.println(oneWayTicket.getValue());
        System.out.println(Line.C.toString());
    }
}