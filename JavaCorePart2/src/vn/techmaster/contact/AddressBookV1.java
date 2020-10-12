package vn.techmaster.contact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBookV1 implements AddressBook<Person> {
    private ArrayList<Person> list;

    public AddressBookV1() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Person other) {
        list.add(other);
    }

    @Override
    public Person search(String name) {
        for (var item : list)
            if (item.getName().contains(name))
                return item;
        return null;
    }

    @Override
    public List<Person> sort(int compareAttribute) {
        return null;
    }

    @Override
    public List<Person> sort() {
        Collections.sort(list);
        return list;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
