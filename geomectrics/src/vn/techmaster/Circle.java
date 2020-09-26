package vn.techmaster;

public class Circle extends GeometricObject {
    private int radius;
    private final int PI = 3;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }

    public int getArea() {
        return (int)(Math.pow(radius, 2)) * PI;
    }
}
