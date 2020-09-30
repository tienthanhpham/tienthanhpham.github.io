package vn.techmaster.highway;

public class Line {
    public final static Gate A = new Gate("A", 0);
    public final static Gate B = new Gate("B", 5);
    public final static Gate C = new Gate("C", 8);
    public final static Gate D = new Gate("D", 11);

    public static int getFare(int distance) {
        return (int)(120 + Math.ceil((distance - 4) / 2.0) * 30);
    }

}
