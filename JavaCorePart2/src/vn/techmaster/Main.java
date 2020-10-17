package vn.techmaster;

import vn.techmaster.reservation.FrontDesk;
import java.lang.String;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //FrontDesk.run();
        Date date1 = new Date(10, 15, 2020);
        Date date2 = new Date(10, 18, 2020);
        Date date = new Date();
        var dateDiff = (date2.getTime() - date1.getTime());
        System.out.println(date.getTime()/ (24 * 60 * 60 * 1000));
    }
}