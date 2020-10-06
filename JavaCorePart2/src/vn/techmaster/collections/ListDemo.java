package vn.techmaster.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(0,"c");
        Collections.addAll(list, "d", "e");
        list.set(0,"!");
        list.get(0);
        list.remove(1);
        list.indexOf("b");
        list.lastIndexOf("d");
        list.subList(0, 2);
        System.out.println(list);
    }
}
