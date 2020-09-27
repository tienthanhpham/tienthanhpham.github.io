package vn.techmaster;

import vn.techmaster.toller.Line;
import vn.techmaster.toller.OneWayTicket;
import vn.techmaster.toller.PrepaidCard;

public class Main {
    public static void main(String[] args) {
        var oneWayTicket = new OneWayTicket(180);
        var prepaidCard = new PrepaidCard(200);

        Line.A.enter(oneWayTicket);
        Line.B.exit(oneWayTicket);
        System.out.println(oneWayTicket.toString());

        Line.A.enter(prepaidCard);
        Line.D.exit(prepaidCard);
        System.out.println(oneWayTicket.toString());

    }
}
