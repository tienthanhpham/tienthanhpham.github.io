package vn.techmaster.sohoc;

public class RationalNumber extends ComparableNumber<RationalNumber> {
    private final int tuso;
    private final int mauso;

    public RationalNumber(int tuso, int mauso) {
        if (mauso == 0)
            throw new ArithmeticException("Mau so ko hop le!");

        int USCLN = greatestCommonDivisor(tuso, mauso);

        tuso /= USCLN;
        mauso /= USCLN;

        if (mauso < 0) {
            tuso = -tuso;
            mauso = -mauso;
        }

        this.tuso = tuso;
        this.mauso = mauso;
    }

    private int greatestCommonDivisor(int a, int b) {
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
        return (double) (tuso / mauso);
    }

    @Override
    public RationalNumber add(RationalNumber other) {
        return new RationalNumber(
          this.tuso * other.mauso + other.tuso * this.mauso,
          this.mauso * other.mauso
        );
    }

    @Override
    public RationalNumber sub(RationalNumber other) {
        return add(new RationalNumber(other.tuso * (-1), other.mauso));
    }

    @Override
    public String toString() {
        return tuso + "/" + mauso;
    }
}
