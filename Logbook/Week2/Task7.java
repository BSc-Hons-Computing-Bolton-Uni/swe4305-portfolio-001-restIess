package Logbook.Week2;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // asks the user to enter their mark
        System.out.print("Enter your exam mark (0-100): ");
        int mark = scanner.nextInt();

        // grade calculation/assignment
        if (mark >= 70) {
            System.out.println("Grade: A");
        } else if (mark >= 60) {
            System.out.println("Grade: B");
        } else if (mark >= 50) {
            System.out.println("Grade: C");
        } else if (mark >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}
