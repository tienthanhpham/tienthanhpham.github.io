package vn.techmaster.address;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddressBookV1 implements AddressBook {
    private List<Person> list;

    public AddressBookV1() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Person newPerson) {
        list.add(newPerson);
    }

    @Override
    public Person search(String searchName) {
        for (Person item : list)
            if (item.getName().contains(searchName))
                return item;
        return null;
    }

    @Override
    public List<Person> sort(int attribute) {
        if (!(attribute == Person.NAME || attribute == Person.AGE)) {
            throw new IllegalArgumentException();
        }
        Collections.sort(list);
        return list;
    }
}
