package vn.techmaster;

import java.util.Scanner;

public class GuessBirthday {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int day = 0;

        var set1 = new Set((byte) 1);
        var set2 = new Set((byte) 2);
        var set3 = new Set((byte) 4);
        var set4 = new Set((byte) 8);
        var set5 = new Set((byte) 16);
        System.out.print("Is your birthday in Set1?\n");
        System.out.print(set1.getSet());
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();
        if (answer == 1)
            day += set1.getFirstNumber();

        System.out.print("Is your birthday in Set2?\n");
        System.out.print(set2.getSet());
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1)
            day += set2.getFirstNumber();

        System.out.print("Is your birthday in Set3?\n");
        System.out.print(set3.getSet());
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1)
            day += set3.getFirstNumber();

        System.out.print("Is your birthday in Set4?\n");
        System.out.print(set4.getSet());
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1)
            day += set4.getFirstNumber();

        System.out.print("Is your birthday in Set5?\n");
        System.out.print(set5.getSet());
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1)
            day += set5.getFirstNumber();

        System.out.println("Your birth day is " + day);
    }
}
