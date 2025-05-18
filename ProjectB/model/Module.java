package ProjectB.model;
import java.util.HashMap;
import java.util.Map;

public class Module {
    private String code;
    private String title;
    private Map<String, Integer> studentMarks = new HashMap<>(); // stores student marks

    public Module(String code, String title) {
        this.code = code; // module code num
        this.title = title; // module's title name
    }

    // add/update student marks
    public void addStudentMark(String studentId, int mark) {
        studentMarks.put(studentId, mark);
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    // retrieves all marks for the students in a specified module
    public Map<String, Integer> getAllMarks() {
        return studentMarks;
    }
}