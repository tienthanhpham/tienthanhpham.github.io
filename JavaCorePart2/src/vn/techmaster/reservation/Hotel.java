package vn.techmaster.reservation;

import java.util.ArrayList;

public class Hotel {
    private static String name;

    public Hotel(String name) {
        this.name = name;
    }

    public static void setName(String name) {
        Hotel.name = name;
    }

    private static ArrayList<Room> rooms = new ArrayList<>();

    public static void addRoom(Room room) {
        rooms.add(room);
    }

    public static ArrayList<Room> getRooms() {
        return rooms;
    }

    public static Room searchRoom(int roomNumber) {
        for (var room : rooms) {
            if (room != null)
                if (room.getRoomNumber() == roomNumber)
                    return room;
        }
        return null;
    }
}
