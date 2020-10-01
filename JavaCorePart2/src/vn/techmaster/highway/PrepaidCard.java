package vn.techmaster.highway;

public class PrepaidCard implements Payable {
    private Gate origin;
    private int value;
    private boolean valid = true;

    public PrepaidCard(int value) {
        this.value = value;
    }

    @Override
    public void setValid(boolean valid) {

    }

    @Override
    public void adjustValue(int amount) {
        deduct(amount);
    }

    @Override
    public boolean isValid() {
        return getValue() > 0;
    }

    @Override
    public void deduct(int amount) {
        value -= amount;
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
}
