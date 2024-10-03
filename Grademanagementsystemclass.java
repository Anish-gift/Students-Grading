import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

class GradeManagementSystem {
    private List<Student> students;

    // Constructor
    public GradeManagementSystem() {
        students = new ArrayList<>();
    }

    // Method to add a new student
    public void addStudent(String name, String id) {
        students.add(new Student(name, id));
        System.out.println("Student added successfully.");
    }

    // Method to find a student by ID
    public Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null; // Student not found
    }

    // Method to add grades for a student
    public void addGradeToStudent(String id, double grade) {
        Student student = findStudentById(id);
        if (student != null) {
            student.addGrade(grade);
            System.out.println("Grade added successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to display all students with their grades
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average: " + student.calculateAverage());
                System.out.println();
            }
        }
    }

    // Method to delete a student by ID
    public void deleteStudentById(String id) {
        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
