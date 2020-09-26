package vn.techmaster.dayofweek;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int dayOfWeek() {
        int h;
        int q = day;
        int m = month; //phai bien doi neu month < 3
        int j;
        int k = year; ////phai bien doi neu month < 3

        if (m < 3) {
            m = m + 12;
            k = k - 1;
        }

        j = k / 100;
        k = k % 100;

        h = (q + (26 * (m + 1)) / 10 + k + (int)k / 4 + (int)j / 4 + 5 * j) % 7;
        if (h < 0)
            h = h + 7;

        return h;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
