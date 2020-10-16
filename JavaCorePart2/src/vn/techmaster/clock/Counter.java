package vn.techmaster.clock;

public class Counter {
    private int value, limit;
    private String label;

    public Counter(int value, int limit, String label) {
        if (limit <= 0) {
            throw new IllegalArgumentException();
        }
        this.limit = limit;
        setValue(value);
        this.label = label;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0){
            throw new IllegalArgumentException();
        }
        this.value = value % limit;
    }

    public void resetValue() {
        setValue(0);
    }

    public int getLimit() {
        return limit;
    }

    public void countUp() {
        setValue(getValue() + 1);
    }

    public void countDown() {
        if (getValue() > 0) {
            setValue(getValue() - 1);
        } else {
            setValue(getLimit() - 1);
        }
    }

    public String toString() {
        return label + ": " + getValue();
    }

}
