package Logbook.Week1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter the deposit amount
        System.out.print("Enter the deposit amount: ");
        double deposit = scanner.nextDouble();

        // Sets interest rate (1%)
        double interestRate = 0.01;

        // Calculates interest earned
        double interest = deposit * interestRate;

        // Calculates final amount after adding the interest
        double finalAmount = deposit + interest;

        // Output interest earned and the total amount after interest
        System.out.println("Interest for the year: " + interest);
        System.out.println("Total amount after interest: " + finalAmount);
    }
}