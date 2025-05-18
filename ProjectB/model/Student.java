package ProjectB.model;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String id; // the student's id number
    private String name; // student name
    private Map<String, Integer> marks = new HashMap<>(); // stores marks per module

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    // adds or updates mark for a specific module
    public void addMark(String moduleCode, int mark) {
        marks.put(moduleCode, mark);
    }

    public Integer getMark(String moduleCode) {
        return marks.get(moduleCode);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // returns all the module marks for the student
    public Map<String, Integer> getMarks() {
        return marks;
    }
}

