package ProjectB.util;
public class GradeCalculator {
    public static String getGrade(int mark) {
        if (mark >= 70 && mark <= 100) return "A";
        else if (mark >= 60) return "B";
        else if (mark >= 50) return "C";
        else if (mark >= 40) return "D";
        else return "F";
    }

    public static String getClassification(String grade) {
        return switch (grade) {
            case "A" -> "First Class";
            case "B" -> "Upper Second Class";
            case "C" -> "Lower Second Class";
            case "D" -> "Third Class";
            default -> "Fail";
        };
    }
}
