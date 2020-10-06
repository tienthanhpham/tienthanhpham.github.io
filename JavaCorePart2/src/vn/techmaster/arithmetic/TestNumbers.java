package vn.techmaster.arithmetic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestNumbers {
    public static void run() {
        var doubleNumber1 = new DoubleNumber(7.5);
        var doubleNumber2 = new DoubleNumber(5.5);

        var doubleSum = doubleNumber1.add(doubleNumber2);
        //System.out.println(doubleSum);

        var doubleSub = doubleNumber1.sub(doubleNumber2);
        //System.out.println(doubleSub);

        var rationalNumber1 = new RationalNumber(3, 9);
        var rationalNumber2 = new RationalNumber(6, 8);

        var rationalSum = rationalNumber1.add(rationalNumber2);
        var rationalSub = rationalNumber1.sub(rationalNumber2);

        //System.out.println(rationalSum);

        List<ComparableNumber<?>> numbers = new ArrayList<>();
        numbers.add(doubleNumber1);
        numbers.add(doubleNumber2);
        numbers.add(rationalNumber1);
        numbers.add(rationalNumber2);
        numbers.add(doubleSum);
        numbers.add(doubleSub);
        numbers.add(rationalSum);
        numbers.add(rationalSub);

        //Collections.sort(numbers);

        for (ComparableNumber<?> number : numbers)
            System.out.println(number);
    }
}
