package vn.techmaster;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter a rate: ");
        float annualRate = input.nextFloat();
        float monthlyRate = annualRate / MONTHS_IN_YEAR / PERCENT;
        System.out.print("Enter a period: ");
        short years = input.nextShort();
        int numberOfPayment = years * MONTHS_IN_YEAR;

        double payment = principal * monthlyRate * Math.pow(1 + monthlyRate, numberOfPayment) / (Math.pow(1 + monthlyRate, numberOfPayment) - 1);
        System.out.print("Monthly payment: " + payment);
    }
}
