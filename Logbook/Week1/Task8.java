package Logbook.Week1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter the number of feet
        System.out.print("Enter the number of feet: ");
        double feet = scanner.nextDouble();

        // Converts number of feet to miles (1 mile = 5280 feet)
        double miles = feet / 5280;

        // Outputting the conversion result
        System.out.println(feet + " feet is equal to " + miles + " miles.");
    }
}
