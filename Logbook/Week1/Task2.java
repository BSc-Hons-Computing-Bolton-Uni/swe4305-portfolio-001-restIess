package Logbook.Week1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Output with the user's name
        System.out.println("Hello " + name + "!");
    }
}
