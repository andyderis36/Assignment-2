import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String name = "";
        int matric = 0;
        double carryMark = 0.0;
        double finalExamMark = 0.0;

        boolean exit = false;

        // Main menu loop
        while (!exit) {
            System.out.println("\n--- MAIN MENU ---\n");
            System.out.println("0. Exit");
            System.out.println("1. Input Student Data");
            System.out.println("2. View Data");
            System.out.println("3. Edit Mark");
            System.out.print("Enter Menu: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Input student data
                    System.out.println("\n--- INPUT DATA ---\n");
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter Matric: ");
                    matric = scanner.nextInt();
                    System.out.print("Enter Carry Mark (60%): ");
                    carryMark = scanner.nextDouble();
                    System.out.print("Enter Final Exam Mark (40%): ");
                    finalExamMark = scanner.nextDouble();
                    break;

                case 2:
                    // View student data
                    viewData(name, matric, carryMark, finalExamMark);
                    System.out.print("\nPress Enter to return to the Main Menu.\n");
                    scanner.nextLine();
                    break;

                case 3:
                    // Edit marks
                    System.out.println("\n--- EDIT MARK ---\n");
                    System.out.print("Enter new Carry Mark (60%): ");
                    carryMark = scanner.nextDouble();
                    System.out.print("Enter new Final Exam Mark (40%): ");
                    finalExamMark = scanner.nextDouble();
                    break;

                case 0:
                    // Exit the program
                    exit = true;
                    System.out.println("\nExiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        // Close the scanner
        // scanner.close();
    }

    // Method to view student data
    private static void viewData(String name, int matric, double carryMark, double finalExamMark) {
        double totalMark = (carryMark * 0.6) + (finalExamMark * 0.4);
        String grade = calculateGrade(totalMark);

        System.out.println("\n--- STUDENT DATA ---\n");
        System.out.println("Name: " + name);
        System.out.println("Matric: " + matric);
        System.out.println("Carry Mark: " + carryMark);
        System.out.println("Final Exam Mark: " + finalExamMark);
        System.out.println("Total Mark: " + totalMark);
        System.out.println("Grade: " + grade);
    }

    // Method to calculate the grade
    private static String calculateGrade(double totalMark) {
        if (totalMark > 100) {
            return "A+++";
        } else if (totalMark == 100) {
            return "A+";
        } else if (totalMark >= 90) {
            return "A";
        } else if (totalMark >= 80) {
            return "B+";
        } else if (totalMark >= 70) {
            return "B";
        } else if (totalMark >= 60) {
            return "C+";
        } else {
            return "C";
        }
    }
}
