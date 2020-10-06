package vn.techmaster.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void show() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Phuc", "e1"));
        customers.add(new Customer("Cuong", "e2"));

        Collections.sort(customers, new EmailComparator());
    }
}
