package vn.techmaster;

public class Points {
    private int x;
    private int y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Points))
            return false;
        Points point = (Points) obj;
            if ((x == point.x) && (y == point.y))
                return true;
            return false;
    }

    @Override
    public String toString() {
        return (x + ", " + y);
    }
}
