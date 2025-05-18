package ProjectB;
import ProjectB.service.UniversitySystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UniversitySystem system = new UniversitySystem();
        Scanner sc = new Scanner(System.in); // reads user input from the console

        // this is an infinite loop to show the display menu until the user exits the program
        while (true) {
            System.out.println("\n--- University Grading System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Module");
            System.out.println("3. Add Mark");
            System.out.println("4. View Student Grades");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> system.addStudent(sc);
                case 2 -> system.addModule(sc);
                case 3 -> system.addMark(sc);
                case 4 -> system.viewStudentGrades(sc);
                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
