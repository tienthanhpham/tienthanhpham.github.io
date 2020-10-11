package vn.techmaster.lambda;

public class LambdaDemo {

    public LambdaDemo(String message) {
        display(new Printer() {
            @Override
            public void print(String message) {

            }
        });

    }

    public static void greet() {
        Printer printer = str -> System.out.println(str);
    }
    public static void display(Printer printer) {
        printer.print("Hello");
    }

}
