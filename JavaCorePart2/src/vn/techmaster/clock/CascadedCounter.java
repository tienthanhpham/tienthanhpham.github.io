package vn.techmaster.clock;

public class CascadedCounter extends Counter {
    private Counter leftSide;

    public CascadedCounter(int value, int limit, String label) {
        super(value, limit, label);
    }

    public void countUp() {
        if ((getValue() + 1) == getLimit() && leftSide != null)
            leftSide.countUp();
        super.countUp();
    }

    public void countDown() {
        if (getValue() == 0 && leftSide != null)
            leftSide.countDown();
        super.countDown();
    }

    public void resetValue() {
        super.resetValue();
        if (leftSide != null)
            leftSide.resetValue();
    }

    public void connectLeft(Counter leftSide) {
        this.leftSide = leftSide;
    }
    public void disconnectLeft() {
        this.leftSide = null;
    }

    public String toString() {
        String str = "";
        if (leftSide != null)
            str += leftSide;
        str += " " + super.toString();
        return str;
    }

    public Counter getLeftSide() {
        return leftSide;
    }
}