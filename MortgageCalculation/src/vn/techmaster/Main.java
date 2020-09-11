package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        double principal = readInput
                ("Nhap vao so tien goc: ", 1000, 1000_000,
                        "So tien goc phai tu 1K - 1000K");
        float monthlyRate = (float)readInput
                ("Nhap vao lai suat: ", 0, 30,
                        "Lai suat phai tu 0 - 30") / MONTHS_IN_YEAR / PERCENT;
        int paymentPeriods = (byte)readInput
                ("Nhap vao ky han: ", 0, 30,
                        "Ky han phai tu 0 - 30") * MONTHS_IN_YEAR;
        double mortgage = mortgageCal(principal, monthlyRate, paymentPeriods);
        System.out.println("So tien tra hang thang:" + mortgage);
    }

    public static double readInput
            (String message, double min, double max, String errorMessage) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

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

    public static double mortgageCal(double principal, float monthlyRate, int paymentPeriods) {
        double mortgage = principal * monthlyRate * Math.pow(1 + monthlyRate, paymentPeriods)
                / (Math.pow(1 + monthlyRate, paymentPeriods) - 1);
        return mortgage;
    }


}
