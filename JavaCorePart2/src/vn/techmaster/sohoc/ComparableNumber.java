package vn.techmaster.sohoc;

public abstract class ComparableNumber<T>
        implements ArithmeticOperation<T>, Comparable<ComparableNumber<?>> {

    public abstract double doubleValue();

    @Override
    public int compareTo(ComparableNumber<?> o) {
        if (this.doubleValue() < o.doubleValue())
            return 1;
        if (this.doubleValue() > o.doubleValue())
            return -1;
        return 0;
    }
}
