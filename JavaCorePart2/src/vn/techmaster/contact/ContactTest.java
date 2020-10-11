package vn.techmaster.contact;

public class ContactTest {
    public static void test() {
        var book1 = new AddressBookV1();
        book1.add(new Person("Phuc", 20, 'M'));
        book1.add(new Person("Giang", 22, 'F'));
        book1.add(new Person("Quan", 21, 'M'));

        var book3 = new AddressBookV3(3);
        book3.add(new Person("Phuc", 20, 'M'));
        book3.add(new Person("Giang", 22, 'F'));
        book3.add(new Person("Quan", 21, 'M'));

        var list = book3.sort(1);
        System.out.println(list);

    }
}
