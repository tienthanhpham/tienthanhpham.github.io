package vn.techmaster;

public class GeometricObject implements Comparable<GeometricObject>{
    private String color;
    private boolean filled;
    private int area = 0;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public int getArea() {
        return area;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return this.getArea() > o.getArea() ? this.getArea() : o.getArea();
    }
}
