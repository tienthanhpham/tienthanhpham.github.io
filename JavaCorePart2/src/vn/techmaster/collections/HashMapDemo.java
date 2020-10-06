package vn.techmaster.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void show() {
        var c1 = new Customer("Thanh","e1");
        var c2 = new Customer("Quan","e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        map.replace("e2", new Customer("Cuong", "e3"));
        System.out.println(map.get("e1"));
        System.out.println(map.getOrDefault("e10",new Customer("unknown", null)));

        for (var key: map.keySet())
            System.out.println(key);

        for (var entry: map.entrySet())
            System.out.println(entry);

        for (var entry: map.entrySet())
            System.out.println(entry.getKey());

        for (var value: map.values())
            System.out.println(value);
    }
}
