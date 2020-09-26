package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        var circle = new Circle(4);
        var rectangle = new Rectangle(1,2);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        int max = circle.compareTo(rectangle);
        System.out.println(max);
    }
}
