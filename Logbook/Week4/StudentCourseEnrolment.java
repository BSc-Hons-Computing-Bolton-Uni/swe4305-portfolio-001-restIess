package Logbook.Week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentCourseEnrolment {

    // task 1: Module class with attributes name and code
    static class Module {
        String name;
        String code;

        // constructor to establishthe module
        public Module(String name, String code) {
            this.name = name;
            this.code = code;
        }

        // task 8: convert marks to a letter grade
        public Grade getGrade(int mark) {
            if (mark >= 85) return Grade.A;
            else if (mark >= 70) return Grade.B;
            else if (mark >= 50) return Grade.C;
            else if (mark >= 40) return Grade.D;
            else return Grade.F;
        }

        // print the module details
        public void print() {
            System.out.println("Module Name: " + name);
            System.out.println("Module Code: " + code);
        }
    }

    // task 2: Course class with an ArrayList of Module objects
    static class Course {
        String code;
        String name;
        ArrayList<Module> modules;

        // constructor to establish the course and add four modules
        public Course(String code, String name) {
            this.code = code;
            this.name = name;
            modules = new ArrayList<>();
            // adding four modules to the course
            modules.add(new Module("Module 1", "CO001"));
            modules.add(new Module("Module 2", "CO002"));
            modules.add(new Module("Module 3", "CO003"));
            modules.add(new Module("Module 4", "CO004"));
        }

        // task 3: modify the print method to output the details of the four modules
        public void print() {
            System.out.println("Course Code: " + code);
            System.out.println("Course Name: " + name);
            for (Module module : modules) {
                module.print();
            }
        }
    }

    // task 4: Student class with ID, name, and marks array
    static class Student {
        int id;
        String name;
        Course course;
        int[] marks;

        // constructor to establish student ID and name, and marks array for 4 modules
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
            this.marks = new int[4]; // Marks array for 4 modules
        }

        // task 5: Assign specific marks to each module (between 0-100)
        public void assignMarks(int[] marks) {
            // Ensure the array passed in has exactly 4 marks
            if (marks.length == 4) {
                this.marks = marks;
            } else {
                System.out.println("Error: Marks array must contain exactly 4 values.");
            }
        }

        // task 7: random number generator to assign marks (between 0-100)
        public void generateRandomMarks() {
            Random rand = new Random();
            for (int i = 0; i < marks.length; i++) {
                marks[i] = rand.nextInt(101); // Random mark between 0 and 100
            }
        }

        // task 6: modify print method to output module details and marks
        public void print() {
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            if (course != null) {
                System.out.println("Enrolled in course: " + course.name);
                for (int i = 0; i < course.modules.size(); i++) {
                    Module module = course.modules.get(i);
                    int mark = marks[i];
                    Grade grade = module.getGrade(mark);
                    System.out.println(module.name + " - Mark: " + mark + " (" + grade + ")");
                }
            } else {
                System.out.println("Not enrolled in any course.");
            }
        }
    }

    // grade representation
    enum Grade {
        A, B, C, D, F
    }

    // task 9: ModuleMark class for separating marks from students and modules
    static class ModuleMark {
        Student student;
        Module module;
        int mark;

        public ModuleMark(Student student, Module module, int mark) {
            this.student = student;
            this.module = module;
            this.mark = mark;
        }

        public int getMark() {
            return mark;
        }
    }

    // extension: creating a list of students and generate random marks for each of their modules
    static class Statistics {
        // calculate descriptive stats for a list of students
        public static void printStatistics(List<Student> students) {
            for (Student student : students) {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                int total = 0;

                for (int mark : student.marks) {
                    min = Math.min(min, mark);
                    max = Math.max(max, mark);
                    total += mark;
                }

                double mean = total / 4.0; // calculate mean average
                System.out.println("Statistics for " + student.name + ":");
                System.out.println("Min Mark: " + min);
                System.out.println("Max Mark: " + max);
                System.out.println("Mean Mark: " + mean);
            }
        }
    }

    // task 4+5 extra: Main method to create students and course, and generate marks
    public static void main(String[] args) {
        // Creating the student and course objects
        Student student1 = new Student(100203324, "Mark Thwaite");
        Student student2 = new Student(100203325, "Jim Jeffrey");

        Course course = new Course("SWE4305", "Object Oriented Programming");

        // enrolling students in course
        student1.course = course;
        student2.course = course;

        // assigning marks (random marks (Task 7))
        student1.generateRandomMarks(); // Random marks for student1
        student2.generateRandomMarks(); // Random marks for student2


        // Printing student details along with course and modules
        student1.print();
        student2.print();

        // Print descriptive statistics for all students
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        Statistics.printStatistics(students);
    }
}
