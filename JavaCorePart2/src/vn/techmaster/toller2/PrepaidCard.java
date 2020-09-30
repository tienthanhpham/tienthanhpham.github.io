package vn.techmaster.toller2;

public class PrepaidCard implements Payable {
    private Gate gate;
    private int value;

    public PrepaidCard(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void adjustValue(int amount) {
        deduct(amount);
    }

    @Override
    public void deduct(int amount) {
        value -= amount;
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
        return getValue() > 0;
    }

    @Override
    public void setValid(boolean valid) {

    }
}
