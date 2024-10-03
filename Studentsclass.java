import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String id;
    private List<Double> grades;

    // Constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Double> getGrades() {
        return grades;
    }

    // Method to add a grade to the student's list of grades
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Method to calculate the average grade
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
