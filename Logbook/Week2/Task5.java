package Logbook.Week2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // asks user to choose a multiplication table
        System.out.print("Enter a number to see its multiplication table: ");
        int num = scanner.nextInt();

        // Prints multiplication table for the chosen number
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }

        scanner.close();
    }
}
