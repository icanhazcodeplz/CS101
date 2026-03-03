// TODO:  import the Scanner class
public class lab8WhileLoops {
    public static void main(String[] args) {

        System.out.println("\n--- Print 1 through 5 (for loop) ---");
        // 1. Write a for-loop that prints the numbers 1 through 5

        System.out.println("\n--- Print 1 through 5 (while loop) ---");
        // 2. Now do the same thing using a while loop (print the numbers 1 through 5)
        // Hint: create an int variable called `i` and set it to 1 before the loop,
        //       then increment it with `i++` inside the loop

        System.out.println("\n--- Counting Down by Twos (for loop) ---");
        // 3. Write a for-loop that prints the numbers from 10 to 2, counting down by 2 each time
        // WARNING: Use a variable name other than `i`. You initialized `i` in number 2 so you can't reuse it.
        // Hint: You might use `<var> -= 2` somewhere in your for loop definition

        System.out.println("\n--- Counting Down by Twos (while loop) ---");
        // 4. Now do the same thing as 3 using a while loop

        System.out.println("\n--- Accumulating a Sum ---");
        // 5. Create an int variable called `sum` and set it to 0

        // 6. Write a while loop that adds the numbers 1 through 10 to `sum`
        // HINT: You will need another variable to represent the amount you want to add to `sum`.
        //    This will be the variable you increment at the end of the while loop.


        // TODO: Uncomment the line below
        // System.out.println("Sum of 1 to 10: " + sum);

        System.out.println("\n--- Input Validation ---");

        // 7. Instantiate a Scanner object and call it `scanner`.

        // TODO: Uncomment the lines below
        // System.out.print("Enter a number between 1 and 10: ");
        // int number = scanner.nextInt();

        // 8. Write a while loop that keeps asking the user to enter a number
        //    as long as the number is NOT between 1 and 10 (inclusive)
        //    Inside the loop:
        //      - print "Invalid! Try again: "
        //      - read a new value into `number` using scanner.nextInt()

        // TODO: Uncomment the line below
        // System.out.println("You entered: " + number);


        System.out.println("\n--- Do-While Loop ---");

        // A do-while loop always runs at least once, then checks the condition.
        // Syntax:
        //   do {
        //       // code
        //   } while (condition);

        // 9. Write a do-while loop that prints the numbers 1 through 5
        //     - Create an int variable called `j` and set it to 1
        //     - Inside the do block, print `j` and then increment it
        //     - The loop should continue while `j` is less than or equal to 5


        System.out.println("\n--- Do-While Loop (Dice Roll) ---");

        // 5% EXTRA CREDIT: Write a do-while loop that rolls a die until you get a 6.
        //     - Create an int variable called `roll`
        //     - Inside the do block:
        //         - set `roll` to a random number 1-6 using: (int)(Math.random() * 6) + 1
        //         - print "Rolled: " + roll
        //     - The loop should continue while `roll` is not equal to 6
        //     - After the loop, print "Got a 6!"
        // Why do-while? You need to roll at least once before you can check the result.

    }
}