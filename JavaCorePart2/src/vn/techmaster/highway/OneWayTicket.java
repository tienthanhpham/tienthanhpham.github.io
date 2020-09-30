package vn.techmaster.highway;

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
}
