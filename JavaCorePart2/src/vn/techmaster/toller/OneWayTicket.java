package vn.techmaster.toller;

public class OneWayTicket extends Ticket {
    private boolean valid = true;

    public OneWayTicket(int value) {
        super(value);
    }

    @Override
    public void adjustValue(int amount) {

    }

    @Override
    public boolean isValid() {
        return valid;
    }

    @Override
    public void setOrigin(Gate gate) {
        super.setOrigin(gate);
    }

    @Override
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTicket status: " + valid;
    }
}
