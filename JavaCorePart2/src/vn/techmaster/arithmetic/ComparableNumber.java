package vn.techmaster.arithmetic;

public abstract class ComparableNumber<T>
        implements ArithmeticOperation<T>, Comparable<ComparableNumber<?>> {
    public abstract double doubleValue();

    @Override
    public int compareTo(ComparableNumber<?> o) {
        return Double.compare(doubleValue(), o.doubleValue());
    }
}
