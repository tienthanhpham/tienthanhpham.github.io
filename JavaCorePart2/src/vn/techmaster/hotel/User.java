package vn.techmaster.hotel;

import java.util.List;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public List<Room> viewHotel() {
        return Hotel.getRooms();
    }

    public void register() {

    }
}
