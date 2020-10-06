package vn.techmaster.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void show() {
        List<User> users = new ArrayList<>();
        users.add(new User("Phuc", 9));
        users.add(new User("Cuong", 8));
        Collections.sort(users);
    }
}
