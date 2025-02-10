package Logbook.Week1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Task7 {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Gets current date
        LocalDate currentDate = LocalDate.now();

        // calculates the birth year based on the current year
        int birthYear = currentDate.getYear() - age;

        // asks the user to enter their birthdate (to check if they've already had their birthday this year)
        System.out.print("Enter your birth month (MM): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day (DD): ");
        int birthDay = scanner.nextInt();

        // Calculates user's birthdate this year
        LocalDate birthDateThisYear = LocalDate.of(currentDate.getYear(), birthMonth, birthDay);

        // If the user's birthday has not occurred yet this year, adjust the birth year by 1
        if (currentDate.isBefore(birthDateThisYear)) {
            birthYear = currentDate.getYear() - age - 1;
        }

        // Creating a LocalDate object for the user's actual birthdate
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        // Calculates the time period between the birthdate and the current date
        Period period = Period.between(birthDate, currentDate);

        // Calculates the total number of days the user has been alive
        long daysOld = java.time.temporal.ChronoUnit.DAYS.between(birthDate, currentDate);

        // Outputs the number of days the user has been alive
        System.out.println("You are " + daysOld + " days old.");
    }
}
