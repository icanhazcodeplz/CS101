import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Get 3 test scores
        System.out.print("Enter test score 1: ");
        int score1 = scanner.nextInt();
        System.out.print("Enter test score 2: ");
        int score2 = scanner.nextInt();
        System.out.print("Enter test score 3: ");
        int score3 = scanner.nextInt();

        // Calculate the average
        double average = (score1 + score2 + score3) / 3.0;

        // Round to 2 decimal places
        average = (int)(average * 100) / 100.0;

        // Determine letter grade
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Determine if passing
        boolean passing;
        if (average >= 60) {
            passing = true;
        } else {
            passing = false;
        }

        // Print report card
        System.out.println("===== REPORT CARD =====");
        System.out.println("Student: " + name);
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        System.out.println("Score 3: " + score3);
        System.out.println("Average: " + average);
        System.out.println("Grade:   " + grade);
        if (passing) {
            System.out.println("Status:  PASSING");
        } else {
            System.out.println("Status:  FAILING");
        }
        System.out.println("=======================");

        scanner.close();
    }
}
