package vn.techmaster.contact;

public class ContactTest {
    public static void test() {
        var book1 = new AddressBookV1();
        book1.add(new Person("Phuc", 20, 'M'));
        book1.add(new Person("Giang", 22, 'F'));
        book1.add(new Person("Quan", 21, 'M'));

        var book2 = new AddressBookV2(3);
        book2.add(new Person("Phuc", 20, 'M'));
        book2.add(new Person("Giang", 22, 'F'));
        book2.add(new Person("Quan", 21, 'M'));

        var list2 = book2.sort(1);
        var list1 = book1.sort();
        System.out.println(list2);

    }
}
