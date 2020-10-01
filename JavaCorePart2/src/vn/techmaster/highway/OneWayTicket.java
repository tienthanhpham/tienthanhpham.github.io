package vn.techmaster.highway;

public class OneWayTicket implements Payable {
    private Gate origin;
    private int value;
    private boolean valid = true;

    public OneWayTicket(int value) {
        this.value = value;
    }

    @Override
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public void adjustValue(int amount) {

    }

    @Override
    public boolean isValid() {
        return valid;
    }

    @Override
    public void deduct(int amount) {

    }

    @Override
    public void setOrigin(Gate origin) {
        this.origin = origin;
    }

    @Override
    public Gate getOrigin() {
        return origin;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Gate: " + origin.getName();
    }
}
