package vn.techmaster.hotel;

import java.util.ArrayList;

public class Hotel {
    protected static ArrayList<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    public static void addRoom(Room room) {

    }

    public static ArrayList<Room> getRooms() {
        return rooms;
    }
}
