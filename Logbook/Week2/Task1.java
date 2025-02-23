package Logbook.Week2;

import java.util.Scanner;
import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // gets current date
        LocalDate currentDate = LocalDate.now();

        // calculate the birth year
        int birthYear = currentDate.getYear() - age;

        // ask for birth month and day
        System.out.print("Enter your birth month (MM): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day (DD): ");
        int birthDay = scanner.nextInt();

        // determines if birthday has happened yet this year
        LocalDate birthDateThisYear = LocalDate.of(currentDate.getYear(), birthMonth, birthDay);
        if (currentDate.isBefore(birthDateThisYear)) {
            birthYear--; // adjust the birth year if birthday hasn't happened yet
        }

        // outputs birth year
        System.out.println("You were born in: " + birthYear);

        // checks if the user is 18 or older and outputs a message
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are under 18.");
        }

        scanner.close();
    }
}