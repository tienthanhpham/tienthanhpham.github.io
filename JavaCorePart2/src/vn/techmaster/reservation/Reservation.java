package vn.techmaster.reservation;

import java.util.ArrayList;

public class Reservation {
    private int counter;
    private int reservationNumber;
    private Member member;
    private Room room;
    private boolean isConfirmed = false;
    private boolean authorized = false;
    private static ArrayList<Reservation> reservationHistory = new ArrayList<>();

    public Reservation(Member member, Room room) {
        this.reservationNumber = counter++;
        this.member = member;
        this.room = room;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public static void addReservation(Reservation reservation) {
        reservationHistory.add(reservation);
    }

    public static ArrayList<Reservation> getReservation() {
        return reservationHistory;
    }

    public static Reservation searchReservation(int reservationNumber) {
        for (var reservation : reservationHistory) {
            if (reservation != null)
                if (reservation.getReservationNumber() == reservationNumber)
                    return reservation;
        }
        return null;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public Member getMember() {
        return member;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    @Override
    public String toString() {
        return "Reservation Number: " + reservationNumber + "\t"
                + member + "\t" + room;
    }
}
