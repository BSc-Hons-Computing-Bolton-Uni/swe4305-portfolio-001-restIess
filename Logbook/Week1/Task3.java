package Logbook.Week1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Ask the user to enter the height of the rectangle
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        // Calculate the perimeter (2 * (length + height))
        double perimeter = 2 * (length + height);

        // calculates the area (length * height)
        double area = length * height;

        // outputs the calculated perimeter and area
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}