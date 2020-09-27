package vn.techmaster.toller;

public abstract class Ticket {
    private Gate origin = null;
    private int value;

    public Ticket(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void deduct(int amount) {
        value -= amount;
    }

    public void setOrigin(Gate gate) {
        origin = gate;
    }

    public Gate getOrigin() {
        return origin;
    }

    public abstract void adjustValue(int amount);

    public abstract boolean isValid();

    public abstract void setValid(boolean valid);

    @Override
    public String toString() {
        return "Gate: " + (origin != null ? origin.getName() : "") +
                ". Ticket value: " + value;
    }
}
