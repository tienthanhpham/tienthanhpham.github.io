package vn.techmaster.collection;

import vn.techmaster.generics.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void run() {
        GenericList<User> users = new GenericList<>(3);
        users.add(new User("Thanh"));
        users.add(new User("Nam"));

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


    }
}
