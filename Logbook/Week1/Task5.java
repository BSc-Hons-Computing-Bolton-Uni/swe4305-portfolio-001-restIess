package Logbook.Week1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter the first number
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Asks the user to enter the second number
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Outputs the original order of the two numbers
        System.out.println("Original order: " + num1 + num2);

        // Outputs the reversed order
        System.out.println("Reversed order: " + num2 + num1);
    }
}
