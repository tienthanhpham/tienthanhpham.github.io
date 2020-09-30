package vn.techmaster.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) > 0 ? first : second;
    }

    public static <K, V, X> void print (K name, V age, X birthday) {
        System.out.println(name + ", " + age + ", " + birthday);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    public static void printUsers(GenericsList<? super User> users) {
//        Instructor instructor = users.getItem(0);
        User user = (User)users.getItem(0);
        System.out.println(users);
    }
}
