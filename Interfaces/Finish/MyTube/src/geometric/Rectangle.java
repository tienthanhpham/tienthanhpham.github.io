package geometric;

public class Rectangle extends GeometricObject {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, int width, int height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}
