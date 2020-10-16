package vn.techmaster.reservation;

import java.util.Date;

public class Room {
    private static int counter;
    private int roomNumber;
    private int price;//per day
    private int roomCapacity;
    private boolean available;
    private Date startDate;
    private Date endDate;

    public Room(int price, int roomCapacity, boolean available,
                Date startDate, Date endDate) {
        this.roomNumber = counter++;
        this.price = price;
        this.roomCapacity = roomCapacity;
        this.available = available;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
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
        return "Room number: " + roomNumber + ",\t"
                + "price: " + price + ",\t"
                + "capacity: " + roomCapacity + ",\t"
                + "available: " + available + ",\t"
                + "start date: " + startDate + ",\t"
                + "end date: " + endDate + "\n";
    }
}
