package vn.techmaster.hotel;

import java.util.Date;

public class Room {
    private static int counter;
    private int roomID;
    private int roomCapacity;
    private Date startDate;
    private Date endDate;
    private boolean available;
    private int price;

    public Room(int roomCapacity, Date startDate, Date endDate, boolean available, int price) {
        this.roomCapacity = roomCapacity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.available = available;
        this.price = price;
        this.roomID = counter++;
    }

    public static int getCounter() {
        return counter;
    }


    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

