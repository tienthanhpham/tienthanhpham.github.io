package vn.techmaster.generic;

public class RationalNumber {
    private int tuso;
    private int mauso;

    public RationalNumber(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public RationalNumber add(RationalNumber other) {
        int mauSoChung = this.mauso * other.mauso;
        int tuso = this.tuso + other.mauso + other.tuso * this.mauso;
        return new RationalNumber(tuso, mauSoChung);
    }
}
