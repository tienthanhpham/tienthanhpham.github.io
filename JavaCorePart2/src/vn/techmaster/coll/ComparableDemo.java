package vn.techmaster.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
    public static void userSort() {
        List<Integer> numbers = new ArrayList<>();

        Collections.addAll(numbers, 1, 3, 2);

        List<User> users = new ArrayList<>();
        users.add(new User("Phuc", 10, 170));
        users.add(new User("Nam", 9, 180));

        //Collections.sort(users);

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return 0;
            }
        });

    }
}
