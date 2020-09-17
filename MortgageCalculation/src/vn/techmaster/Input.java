package vn.techmaster;

import java.util.Scanner;

public class Input {
    public static double readInput
            (String message, double min, double max, String errorMessage) {

        double value;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println(errorMessage);
        }
    }
}
