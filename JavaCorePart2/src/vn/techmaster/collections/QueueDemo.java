package vn.techmaster.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        System.out.println(queue.peek());
        System.out.println(queue.element());
        queue.poll();
        queue.remove();
        System.out.println(queue);
    }
}
