package vn.techmaster;

public class LotteryNumber {
    private String lottery;

    public String getLottery() {
        return lottery;
    }

    public LotteryNumber() {
        this.lottery =
                "" + (int)(Math.random()*10) + (int)(Math.random()*10);
    }

}
