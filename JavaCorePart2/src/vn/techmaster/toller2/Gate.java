package vn.techmaster.toller2;

public class Gate {
    private String name;
    private int distance;
    private int distanceCompleted;
    private int fare;

    public Gate(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void enter(Payable ticket) {
        if (ticket.isValid() == true) {
            ticket.setOrigin(this);
            open();
        }
        else
            close();
    }

    public void exit(Payable ticket) {
        if (ticket.getOrigin() != null) {
            if (ticket.isValid() == true) {
                distanceCompleted = Math.abs(ticket.getOrigin().distance - this.distance);
                fare = Line.getFare(distanceCompleted);
                if (ticket.getValue() >= fare) {
                    ticket.adjustValue(fare);
                    ticket.setOrigin(null);
                    ticket.setValid(false);
                    open();
                }
                else
                    close();
            } else
                close();
        } else
            close();

    }

    public void open() {
        System.out.println("Gate " + name + " is opened");
    }

    public void close() {
        System.out.println("Gate " + name + " is closed");
    }

    public int getDistanceCompleted() {
        return distanceCompleted;
    }

    public int getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return "Distance completed: " + getDistanceCompleted()
                + "\nFare: " + getFare();
    }
}
