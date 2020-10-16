package vn.techmaster.reservation;

import java.util.Date;

public class FrontDesk {

    private static int checkCard(Card card) {
        if (card.isEligible())
            return card.getBalance();
        else
            return 0;
    }

    private static boolean checkBooking(int reservationNumber) {
        return true;
    }

    private static void sendEmail(Member member) {
        System.out.println("Send email to " + member);
    }

    public static void run() {
        Hotel.addRoom(new Room(100, 2, true,
                new Date(2020, 10, 15),
                new Date(2020, 10, 17)));
        Hotel.addRoom(new Room(200, 2, true,
                new Date(2020, 10, 18),
                new Date(2020, 10, 20)));

        System.out.println(Hotel.getRooms());

        var user = new User("Thanh");
        var member = user.register("thanhpt", "123456",
                "thanhpt@techmaster.vn",
                "012032595", "Techmaster", "0988565830",
                "037079001195", 500, true);

        var isLogged = member.login();
        if (isLogged) {
            var reservation = member.booking(Hotel.getRooms().get(0), 2,
                    new Date(2020, 10, 15),
                    new Date(2020, 10, 25), 100);

            Reservation.addReservation(reservation);
        }
        else
            System.out.println("Login failed");

    }
}
