package ProjectB.service;
import ProjectB.model.Student;
import ProjectB.model.Module;
import ProjectB.util.GradeCalculator;

import java.util.*;

public class UniversitySystem {
    private final Map<String, Student> students = new HashMap<>();
    private final Map<String, Module> modules = new HashMap<>();

    // for adding students
    public void addStudent(Scanner sc) {
        System.out.print("Enter student ID: ");
        String id = sc.nextLine();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        students.put(id, new Student(id, name));
        System.out.println("Student added.");
    }

    // for adding modules
    public void addModule(Scanner sc) {
        System.out.print("Enter module code: ");
        String code = sc.nextLine();
        System.out.print("Enter module title: ");
        String title = sc.nextLine();
        modules.put(code, new Module(code, title));
        System.out.println("Module added.");
    }

    // for adding marks
    public void addMark(Scanner sc) {
        System.out.print("Enter student ID: ");
        String sid = sc.nextLine();
        System.out.print("Enter module code: ");
        String mcode = sc.nextLine();
        System.out.print("Enter mark: ");
        int mark = sc.nextInt();
        sc.nextLine();

        if (students.containsKey(sid) && modules.containsKey(mcode)) {
            students.get(sid).addMark(mcode, mark);
            modules.get(mcode).addStudentMark(sid, mark);
            System.out.println("Mark added.");
        } else {
            System.out.println("Invalid student or module.");
        }
    }

    // for viewing grades of a specific student
    public void viewStudentGrades(Scanner sc) {
        System.out.print("Enter student ID: ");
        String sid = sc.nextLine();
        Student student = students.get(sid);
        if (student != null) {
            System.out.println("Grades for: " + student.getName());
            for (Map.Entry<String, Integer> entry : student.getMarks().entrySet()) {
                String grade = GradeCalculator.getGrade(entry.getValue());
                String classification = GradeCalculator.getClassification(grade);
                System.out.println("Module: " + entry.getKey() + " | Mark: " + entry.getValue() + " | Grade: " + grade + " | " + classification);
            }
        } else {
            System.out.println("Student not found.");
        }
    }
}
