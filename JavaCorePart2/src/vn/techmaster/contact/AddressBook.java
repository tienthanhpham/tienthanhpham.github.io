package vn.techmaster.contact;

import java.util.List;

public interface AddressBook<T> extends Comparable<T> {
    void add(T other);
    T search(String name);
    List<T> sort(int compareAttribute);
}
