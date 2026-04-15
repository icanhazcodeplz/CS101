import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            int years = 18 - age;
            System.out.println("Wait " + years + " more years to vote.");
        }
    }
}
/*
Sample explanation:

Line 5: Creates a Scanner that reads from the terminal.
Line 7-8: Prompts the user with "How old are you? " and saves the input as int variable `age`
Line 10-15: If age is 18 or more, print "You can vote.". Otherwise, calculate
            years = 18 - age and print "Wait X more years to vote.".
*/
