package vn.techmaster.collections;

import java.util.*;

public class SetDemo {
     public static void show() {
         Set<String> set = new HashSet<>();
         set.add("sky");
         set.add("blue");
         set.add("blue");
         System.out.println(set);

         Set<String> s1 = new HashSet<>(Arrays.asList("a", "b", "c"));
         Set<String> s2 = new HashSet<>(Arrays.asList("e", "b", "f"));

         //Union
         s1.addAll(s2);
         //Intersection
         s1.retainAll(s2);
         //Difference
         s1.removeAll(s2);
     }
}
