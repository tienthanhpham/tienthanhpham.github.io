package vn.techmaster.arithmetic;

public class RationalNumber extends ComparableNumber<RationalNumber> {
    private final int numerator;//tu so
    private final int denominator;//mau so

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0)
            throw new ArithmeticException("Mau so khong hop le");
        int greatestCommonDivisor = greatestCommonDivisor(numerator, denominator);

        numerator /= greatestCommonDivisor;
        denominator /= greatestCommonDivisor;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int greatestCommonDivisor(int a, int b) {
        int r;

        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public RationalNumber add(RationalNumber other) {
        if (numerator == 0)
            return other;

        if (other.numerator == 0)
            return this;

        return new RationalNumber(
                (numerator * other.denominator) + (other.numerator * denominator),
                denominator * other.denominator);
    }

    @Override
    public RationalNumber sub(RationalNumber other) {
        return add(new RationalNumber(other.numerator * (-1), other.denominator));
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
