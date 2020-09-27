package vn.techmaster.toller;

public class Gate {
    private String name;
    private int distance;

    public Gate(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void enter(Ticket ticket) {
        if (ticket.isValid() == true) {
            open();
            ticket.setOrigin(this);
        }
        else
            close();
    }

    public void exit(Ticket ticket) {
        Gate origin = ticket.getOrigin();
        if (origin != null) {
            int d = Math.abs(distance - origin.distance);
            int fare = Line.getFare(d);
            if (ticket.getValue() > fare) {
                ticket.adjustValue(fare);
                ticket.setOrigin(null);
                ticket.setValid(false);
                open();
            } else {
                System.out.println("Fare: " + fare + " & " + ticket.toString());
                close();
            }
        } else
            close();

    }

    public void open() {
        System.out.println("Gate " + name + " is opened");
    }

    public void close() {
        System.out.println("Gate " + name + " is closed");
    }

    public String getName() {
        return name;
    }
}
