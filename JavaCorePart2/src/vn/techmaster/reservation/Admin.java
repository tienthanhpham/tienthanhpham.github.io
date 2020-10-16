package vn.techmaster.reservation;

import java.util.Date;

public class Admin extends User{

    public Admin(String name) {
        super(name);
    }

    public boolean modifyRoom(int roomNumber, int price, int roomCapacity,
                              boolean available,
                              Date startDate, Date endDate) {
        var room = Hotel.searchRoom(roomNumber);
        if (room != null) {
            room.setPrice(price);
            room.setRoomCapacity(roomCapacity);
            room.setAvailable(available);
            room.setStartDate(startDate);
            room.setEndDate(endDate);
            System.out.println("Room info modified!");
            return true;
        }
        System.out.println("Room info modification failed!");
        return false;
    }

    public static void sendEmail(String ID) {
        var member = Member.searchMember(ID);
        if (member != null)
            System.out.println("Email sent to " + member.getUsername());
    }

    public void modifyHotel(String name) {
        Hotel.setName(name);
    }

    public boolean authorizeBooking(int reservationNumber) {
        var reservation = Reservation.searchReservation(reservationNumber);
        if (reservation != null) {
            if (reservation.getMember().getCard().isEligible() == true) {
                reservation.setAuthorized(true);
                return true;
            }
        }
        return false;
    }
}
