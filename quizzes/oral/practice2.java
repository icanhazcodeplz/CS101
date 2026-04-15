import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temp = scanner.nextInt();

        System.out.println(temp + " degrees");

        if (temp < 50) {
            System.out.println("Bring a jacket!");
        } else {
            System.out.println("No jacket needed.");
        }
    }
}
/*
Sample explanation:

Line 5: Creates a Scanner object that reads from the terminal.
Line 7-8: Prompts the user with "Enter the temperature" and save the response into int variable `temp`
Line 10: Prints the temperature followed by " degrees".
Line 12-16: If temp is less than 50, print "Bring a jacket!", otherwise print "No jacket needed.".
*/
