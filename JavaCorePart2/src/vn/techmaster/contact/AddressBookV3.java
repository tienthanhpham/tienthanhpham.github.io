package vn.techmaster.contact;

import java.util.*;

public class AddressBookV3 implements AddressBook<Person> {
    private Map<String, Person> map;

    public AddressBookV3(int size) {
        map = new HashMap<>(3);
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
        for (var item : sorted)
            item.setCompareAttribute(compareAttribute);
        Collections.sort(sorted);
        return sorted;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
