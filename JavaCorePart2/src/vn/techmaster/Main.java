package vn.techmaster;

import vn.techmaster.address.AddressBookV1;
import vn.techmaster.address.Person;
import vn.techmaster.collection.CollectionDemo;

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        AddressBookV1 book1 = new AddressBookV1();
        book1.add(new Person("Thanh", 20, 'M'));
        book1.add(new Person("Quan", 30, 'M'));
//        System.out.println(book1.search("Thanh"));
        System.out.println(book1.sort(0));
    }
}