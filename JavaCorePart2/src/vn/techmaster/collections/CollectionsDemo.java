package vn.techmaster.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        Collections.addAll(collection, "c","d");
        collection.remove("d");
        System.out.println(collection.size());
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        System.out.println(collection.contains("a"));
        //Object[] objectArray = collection.toArray();
        String[] objectArray = collection.toArray(new String[0]);

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(other.equals(collection));
    }
}
