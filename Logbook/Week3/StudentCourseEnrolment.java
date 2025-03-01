package Logbook.Week3;
// task 1
public class StudentCourseEnrolment {
    // 'Student' class with attributes ID and name
    static class Student {
        int id;
        String name;
        //task 8
        Course course;
// task 2
        // constructor to initialise the ID and name
        public Student(int id, String name) {
            this.id = id;
            this.name = name;

        }
// task 9
        public void enrol(Course course) {
            this.course = course;
        }
// task 3
        // display students' details w/ print method
        public void print() {
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            // task 10
            if (course != null) {
                System.out.println("Enrolled in:");
                course.print();
            } else {
                System.out.println("Not enrolled in any course.");
            }
        }
    }
// task 4+5
    public static void main(String[] args) {
        // making myself the student object :)
        Student student = new Student(100203324, "Mark Thwaite");
        // task 11
        Course course = new Course("SWE4305", "Object Oriented Programming");
        student.enrol(course);
        student.print();
    }
    // task 6
    static class Course {
        String code;
        String name;
// task 7
        public Course(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public void print() {
            System.out.println("Course Code: " + code);
            System.out.println("Course Name: " + name);
        }
    }
}
