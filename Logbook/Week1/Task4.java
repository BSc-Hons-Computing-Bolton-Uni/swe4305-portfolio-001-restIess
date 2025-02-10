package Logbook.Week1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Then asks the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // calculate the average of the two numbers
        double average = (num1 + num2) / 2;

        // Then outputs the average value
        System.out.println("The average is: " + average);
    }
}
