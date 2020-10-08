package vn.techmaster.address;

import java.util.List;

public interface AddressBook {
    void add(Person newPerson);
    Person search(String searchName);
    List<Person> sort(int attribute);
}
