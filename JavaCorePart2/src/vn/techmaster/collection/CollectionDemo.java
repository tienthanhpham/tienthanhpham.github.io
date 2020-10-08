package vn.techmaster.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo {
    public static void run() {
        List<User> users = new ArrayList<>();
        users.add(new User("Thanh", 9, 165));
        users.add(new User("Nam", 8, 170));

        Collections.sort(users);

        Collections.sort(users, new NameComparator());

        //for (var item : list)
        //    System.out.println(item);

        System.out.println(users);
    }

}
