package vn.techmaster;

public class LotteryAward {
    private String award;

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String calAward(TicketNumber ticket, LotteryNumber lottery) {
        String ticketNumber = ticket.getTicketNumber();
        String lotteryNumber = lottery.getLottery();

        char ticketNumberDigit1 = ticketNumber.charAt(0);
        char ticketNumberDigit2 = ticketNumber.charAt(1);
        char lotteryNumberDigit1 = lotteryNumber.charAt(0);
        char lotteryNumberDigit2 = lotteryNumber.charAt(1);

        if (ticketNumber.equals(lotteryNumber))
            this.award = "Giai dac biet";
        else if (lotteryNumberDigit1 == ticketNumberDigit2
                && lotteryNumberDigit2 == ticketNumberDigit1)
            this.award = "Giai nhat";
        else if (lotteryNumberDigit1 == ticketNumberDigit1
                || lotteryNumberDigit1 == ticketNumberDigit2
                || lotteryNumberDigit2 == ticketNumberDigit1
                || lotteryNumberDigit2 == ticketNumberDigit2)
            this.award = "Giai khuyen khich";
        else
            this.award = "Khong trung giai";
        return award;
    }
}
