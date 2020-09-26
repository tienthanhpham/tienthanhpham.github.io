package vn.techmaster.toller;

public class Gate {
    private String name;
    private int distance;

    public Gate(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void enter(Ticket ticket) {

    }

    public void exit(Ticket ticket) {

    }

    private void open() {
        System.out.println("Gate opened");
    }

    private void close() {
        System.out.println("Gate closed");
    }
}
