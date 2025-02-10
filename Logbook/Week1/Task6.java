package Logbook.Week1;

import java.util.Scanner;
import java.time.LocalDate;

// Note: Realised my program could be wrong, as it's only removing the age input
// from the current year, so I've decided to add the date and month too so an accurate
// year can be output.

import java.util.Scanner;
import java.time.LocalDate;

public class Task6 {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Gets the current date that the computer's/device's using
        LocalDate currentDate = LocalDate.now();

        // Calculates the birth year based on the current year
        int birthYear = currentDate.getYear() - age;

        // This asks the user to enter their birthdate (to check if they've had their birthday yet)
        System.out.print("Enter your birth month (MM): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day (DD): ");
        int birthDay = scanner.nextInt();

        // Calculate the user's birthdate this year
        LocalDate birthDateThisYear = LocalDate.of(currentDate.getYear(), birthMonth, birthDay);

        // If the user's birthday hasnt happened yet this year, - the birth year by 1
        if (currentDate.isBefore(birthDateThisYear)) {
            birthYear = currentDate.getYear() - age - 1;
        }

        // Outputs birth year
        System.out.println("You were born in: " + birthYear);
    }
}
