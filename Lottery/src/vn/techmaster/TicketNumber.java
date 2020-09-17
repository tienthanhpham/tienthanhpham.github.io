package vn.techmaster;

import java.util.Scanner;

public class TicketNumber {
    private String ticketNumber;

    public TicketNumber() {
        Scanner input = new Scanner(System.in);
        this.ticketNumber = input.nextLine();
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

}
