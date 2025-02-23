package Logbook.Week2;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat;

        do {
            // asks user to choose a multiplication table
            System.out.print("Enter a number to see its multiplication table: ");
            int num = scanner.nextInt();

            // prints multiplication table for the chosen number
            System.out.println("Multiplication table for " + num + ":");
            for (int i = 1; i <= 12; i++) {
                System.out.println(i + " x " + num + " = " + (i * num));
            }

            // asks if user wants to try another table
            System.out.print("Do you want to try another table? (yes/no): ");
            String response = scanner.next();
            repeat = response.equalsIgnoreCase("yes");

        } while (repeat);

        System.out.println("Goodbye!");
        scanner.close();
    }
}
