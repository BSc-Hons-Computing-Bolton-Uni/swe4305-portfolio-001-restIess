package Logbook.Week3;
// task 1
public class StudentCourseEnrolment {
    // 'Student' class with attributes ID and name
    static class Student {
        int id;
        String name;
// task 2
        // constructor to initialise the ID and name
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
// task 3
        // display students' details w/ print method
        public void print() {
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
        }
    }
}
