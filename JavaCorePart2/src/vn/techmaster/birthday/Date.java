package vn.techmaster.birthday;

public class Date {
    private int day;
    private int month;
    private int year;
    private int h;
    private int m;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int dayOfWeek() {
        if (month < 3) {
            m = month + 12;
            year = year - 1;
        }
        else
            m = month;
        int j = year / 100;
        int k = year % 100;
        int q = day;
        h = (q + 26*(m + 1)/10 + k + k/4 + j/4 + 5*j) % 7;
        return h;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
