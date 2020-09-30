package vn.techmaster.toller2;

public class Line {
    public static Gate A = new Gate("A", 0);
    public static Gate B = new Gate("B", 5);
    public static Gate C = new Gate("C", 7);
    public static Gate D = new Gate("D", 11);

    public static int getFare(int distance) {
        return (int)(120 + Math.ceil((distance - 4) / 2.0) * 30);
    }

}
