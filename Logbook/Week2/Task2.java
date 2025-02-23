package Logbook.Week2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // asks the user to enter their letter grade
        System.out.print("Enter your letter grade (A-F): ");
        char grade = scanner.next().toUpperCase().charAt(0);

        // converting the grade to university classification
        switch (grade) {
            case 'A': System.out.println("Classification: 1st Class"); break;
            case 'B': System.out.println("Classification: 2:1 Class"); break;
            case 'C': System.out.println("Classification: 2:2 Class"); break;
            case 'D': System.out.println("Classification: 3rd Class"); break;
            case 'E': System.out.println("Classification: Ordinary Degree"); break;
            case 'F': System.out.println("Classification: Fail"); break;
            default: System.out.println("Invalid grade entered.");
        }

        scanner.close();
    }
}
