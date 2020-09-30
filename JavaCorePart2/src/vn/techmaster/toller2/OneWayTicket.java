package vn.techmaster.toller2;

public class OneWayTicket implements Payable {
    private Gate gate;
    private boolean valid = true;
    private int value;

    public OneWayTicket(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void adjustValue(int amount) {

    }

    @Override
    public void deduct(int amount) {

    }

    @Override
    public void setOrigin(Gate gate) {
        this.gate = gate;
    }

    @Override
    public Gate getOrigin() {
        return gate;
    }

    @Override
    public boolean isValid() {
        return valid;
    }

    @Override
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "\nTicket value: " + value +
                "\nStatus: " + valid;
    }
}
