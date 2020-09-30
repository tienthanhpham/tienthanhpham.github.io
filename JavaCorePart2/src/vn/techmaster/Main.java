package vn.techmaster;

import vn.techmaster.highway.Line;
import vn.techmaster.highway.OneWayTicket;
import vn.techmaster.highway.PrepaidCard;

public class Main {
    public static void main(String[] args) {
        var oneWayTicket = new OneWayTicket(150);
        var prepaidCard = new PrepaidCard(200);

        Line.A.enter(oneWayTicket);
        Line.C.exit(oneWayTicket);
        System.out.println(Line.C);
        System.out.println(oneWayTicket);
    }
}