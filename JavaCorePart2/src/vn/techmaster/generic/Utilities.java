package vn.techmaster.generic;

public class Utilities {
    public static <T extends Comparable> T max(T obj1, T obj2) {
        if (obj1.compareTo(obj2) >= 0)
            return obj1;
        return obj2;
    }

    public static int max2(int item1, int item2) {
        return 0;
    }

    public static <K, V> void printUser(K key, V value) {
        System.out.println(key + "=" + value);
    }
    //capture extends User
    //Teacher extends User
    public static void printUsers(GenericList<?> user) {
        System.out.println(user);
        Object usr = user.get(0);

    }
}
