package vn.techmaster;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var rectangle1 = new Rectangle(1, 2, 10, 5);
        var rectangle2 = new Rectangle(1, 2, 2, 1);
        String result = RectangleCompare.rectangleCompare(rectangle1, rectangle2);
        System.out.println(result);
    }
}
