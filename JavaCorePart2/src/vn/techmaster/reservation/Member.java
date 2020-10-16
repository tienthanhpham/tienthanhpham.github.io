package vn.techmaster.reservation;

import java.util.ArrayList;
import java.util.Date;

public class Member extends User {
    private String username;
    private String password;
    private String email;
    private String ID;
    private String address;
    private String tel;
    private Card card;
    private int deposit;
    private int totalPayment;
    private boolean confirm;
    private int personNumber;
    private Date startDate;
    private Date endDate;
    private static ArrayList<Member> members = new ArrayList<>();;

    public Member(String name, String username, String password, String email, String id, String address, String tel, Card card) {
        super(name);
        this.username = username;
        this.password = password;
        this.email = email;
        ID = id;
        this.address = address;
        this.tel = tel;
        this.card = card;
    }

    public static void addMembers(Member member) {
        members.add(member);
    }

    public static ArrayList<Member> getMembers() {
        return members;
    }


    public boolean login() {
        return true;
    }

    public boolean logout() {
        return true;
    }

    public Reservation booking(Room room, int personNumber, Date startDate, Date endDate, int deposit) {
        var payable = Bank.settlement(this.card, deposit);
        if (payable == false) {
            System.out.println("Problem with card!");
            return null;
        }

        if (room.isAvailable() == true &&
                (room.getStartDate().compareTo(startDate) >= 0) &&
                (room.getEndDate().compareTo(endDate) <= 0)
        ) {
            setPersonNumber(personNumber);
            setStartDate(startDate);
            setEndDate(endDate);
            room.setAvailable(false);
            deposit(deposit);
            System.out.println("Room number " + room.getRoomNumber() + " booked!");
            Admin.sendEmail(this.getID());
            return new Reservation(this, room);
        }
        System.out.println("Booking failed!");
        return null;
    }

    private void deposit(int deposit) {
        this.card.deduct(deposit);
        setDeposit(deposit);
    }

//    public int calculatePrice(Room room, int personNumber, Date startDate, Date endDate) {
//        var total = room.getPrice() * (endDate.compareTo(startDate))
//    }

    public boolean confirm(int reservationNumber) {
        var reservation = Reservation.searchReservation(reservationNumber);
        if (reservation == null)
                return false;
        else if (reservation.isConfirmed() == true) {
            System.out.println("Already confirmed!");
            return true;
        } else {
            reservation.setConfirmed(true);
            System.out.println("Confirmed!");
            return true;
        }
    }

    public boolean cancelBooking(int reservationNumber) {
        var reservation = Reservation.searchReservation(reservationNumber);
        if (reservation == null)
            return false;
        if (reservation.isConfirmed() == true) {
            System.out.println("Unable to cancel!");
            return false;
        } else {
            reservation.setConfirmed(true);
            System.out.println("Booking canceled!");
            return true;
        }
    }

    public static Member searchMember(String ID) {
        for (var member : members) {
            if (member != null)
                if (member.getID().equals(ID))
                    return member;
        }
        return null;
    }

    public boolean updateProfile(String name, String username, String password,
                                 String email, String id, String address, String tel,
                                 String cardNumber, int balance, boolean eligible) {
        var member = Member.searchMember(ID);
        if (member != null) {
            member.setUsername(username);
            member.setPassword(password);
            member.setEmail(email);
            member.setAddress(address);
            member.setTel(tel);
            member.setCard(cardNumber, balance, eligible);
            System.out.println("Profile updated");
        }
        System.out.println("Profile update failed");
        return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(String cardNumber, int balance, boolean eligible) {
        this.card = new Card(cardNumber, balance, eligible);
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
