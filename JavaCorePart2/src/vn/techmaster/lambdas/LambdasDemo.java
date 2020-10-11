package vn.techmaster.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasDemo {
    public static void run() {
        Function<String, String> str1 = str -> str.replace(";", "-");
        Function<String, String> str2 = str -> str.toUpperCase();

        System.out.println(str1.andThen(str2).apply("Tech;Master"));

    }

    private static void show(Printer printer) {

        //System.out.println("");
    }
}
