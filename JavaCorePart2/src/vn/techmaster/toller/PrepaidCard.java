package vn.techmaster.toller;

public class PrepaidCard extends Ticket {

    public PrepaidCard(int value) {
        super(value);
    }

    @Override
    public void adjustValue(int amount) {

    }

    @Override
    public boolean isValid() {
        return false;
    }
}
