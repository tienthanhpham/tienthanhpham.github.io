package vn.techmaster.sohoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestNumber {

    public static void test() {

        List<ComparableNumber<?>> list = new ArrayList<>();
        var doubleNumber1 = new DoubleNumber(7.5);
        var doubleNumber2 = new DoubleNumber(5.5);

        var rationalNumber1 = new RationalNumber(-3, 9);
        var rationalNumber2 = new RationalNumber(6, 8);

        list.add(doubleNumber1);
        list.add(doubleNumber2);

        list.add(rationalNumber1);
        list.add(rationalNumber2);

        Collections.sort(list);
        System.out.println(list);
    }
}
