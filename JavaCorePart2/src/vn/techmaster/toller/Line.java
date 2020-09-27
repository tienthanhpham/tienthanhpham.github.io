package vn.techmaster.toller;

public final class Line {
    public static final Gate A = new Gate("A",0);
    public static final Gate B = new Gate("B",5);
    public static final Gate C = new Gate("C",7);
    public static final Gate D = new Gate("D",11);

    public static int getFare(int distance) {
        return (int)(120 + Math.ceil((double)(distance - 4)/2) * 30);
    }
}
