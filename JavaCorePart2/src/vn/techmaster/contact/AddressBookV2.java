package vn.techmaster.contact;

import java.util.*;

public class AddressBookV2 implements AddressBook<Person> {
    private Map<String, Person> map;
    private static int index;

    public AddressBookV2(int size) {
        map = new HashMap(size);
    }

    @Override
    public void add(Person other) {
        map.put(other.getName(), other);
    }

    @Override
    public Person search(String name) {
        return map.get(name);
    }

    @Override
    public List<Person> sort(int compareAttribute) {
        var sorted = new ArrayList<>(map.values());
        Collections.sort(sorted, getComparator(compareAttribute));
        return sorted;
    }

    @Override
    public List<Person> sort() {
        return null;
    }

    private Comparator getComparator(int compareAttribute) {
        Comparator comp;
        if (compareAttribute == 0)
            comp = new NameComparator();
        else
            comp = new AgeComparator();

        return comp;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
