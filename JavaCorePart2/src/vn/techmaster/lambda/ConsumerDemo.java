package vn.techmaster.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerDemo {

    public static void run() {
        List<String> list = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printUpperCase));
    }
}
