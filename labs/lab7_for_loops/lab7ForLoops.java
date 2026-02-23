public class lab7ForLoops {
    public static void main(String[] args) {
        System.out.println("\n--- Nested if/else ---");

        // 1. Create a Scanner object called "scanner" to read input from the user

        // 2. Write a weather report program using Scanner:
        //   - Ask the user "Is there precipitation? (true/false): " and store it in a boolean called `isPrecipitation`
        //        - use scanner.nextBoolean()
        //   - Ask the user "What is the temperature? " and store it in an int called `temp`
        //        - use scanner.nextInt()
        //   - If there is no precipitation, print "sunny"
        //   - If there is precipitation and temp is above 32, print "rain"
        //   - If there is precipitation and temp is 32 or below, print "snow"
        //
        // Use an if/elseIf/else to solve this.


        // 3. Rewrite your solution using only if and a nested if/else (no "else if").
        //    It should produce the same result.

        System.out.println("\n--- Basic For Loop ---");
        // 4. Write a for-loop that prints the numbers 1 through 5

        System.out.println("\n--- Counting by Steps ---");
        // 5. Write a for-loop that prints even numbers from 2 to 10.
        // Hint: you might use `i+=2` somewhere

        System.out.println("\n--- Counting Down ---");
        // 6. Write a for-loop that counts down from 10 to 1
        // Hint: you might use `i--` somewhere

        System.out.println("\n--- Accumulating a Sum ---");
        // 7. Create an int variable called `sum` and set it to 0

        // 8. Write a for-loop that adds the numbers 1 through 10 to `sum`
        // Hint: you might use `sum += i` inside the loop

        // TODO: Uncomment the line below
        // System.out.println("Sum of 1 to 10: " + sum);

        System.out.println("\n--- User-Controlled Loop ---");

        // TODO: Uncomment the line below
        // System.out.print("\nEnter a number: ");

        // 9. Create an int variable called "n" and use scanner.nextInt() to read the user's input
        int n = scanner.nextInt();

        // 10. Write a for-loop that prints the numbers 1 through n

        System.out.println("\n--- Building a String ---");

        // 11. Create a String variable called `stars` and set it to "" (empty string)

        // 12. Write a for-loop that runs n times and adds a "*" to `stars` each time
        //     Hint: use `stars += "*"`; inside the loop

        // TODO: Uncomment the line below
        // System.out.println("Stars: " + stars);

        System.out.println("\n--- Multiplication Table ---");

        // TODO: Uncomment the line below
        // System.out.print("\nEnter a number for the times table: ");

        // 13. Create an int variable called `mult` and use scanner.nextInt() to read the user's input

        // 14. Write a for-loop that prints `mult` times all the numbers from 1 to 10, each on a separate line
        //     Example output for mult = 3:
        //         1 x 3 = 3
        //         2 x 3 = 6
        //         3 x 3 = 9
        //         ...


    }
}