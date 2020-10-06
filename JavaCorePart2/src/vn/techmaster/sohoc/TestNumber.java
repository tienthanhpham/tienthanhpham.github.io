package vn.techmaster.sohoc;

public class TestNumber {

    public static void test() {
        var doubleNumber1 = new DoubleNumber(7.5);
        var doubleNumber2 = new DoubleNumber(5.5);

        var rationalNumber1 = new RationalNumber(3, 9);
        var rationalNumber2 = new RationalNumber(6, -8);

        System.out.println(rationalNumber2);
        System.out.println(rationalNumber1.sub(rationalNumber2));
    }
}
