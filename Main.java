import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object
        GradeManagementSystem system = new GradeManagementSystem();

        while (true) {
            System.out.println("\nStudent Grade Management System");
            System.out.println("1. Add New Student");
            System.out.println("2. Add Grades for a Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    system.addStudent(name, id);
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter grade to add: ");
                    double grade = scanner.nextDouble();
                    system.addGradeToStudent(id, grade);
                    break;

                case 3:
                    system.displayAllStudents();
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    id = scanner.nextLine();
                    system.deleteStudentById(id);
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close(); // Close the Scanner object
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
        }
    }
}
