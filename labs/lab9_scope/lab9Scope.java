public class lab9Scope {
    public static void main(String[] args) {

        // =============================================================
        //  SCOPE: the region of code where a variable exists and can
        //         be accessed. A variable declared inside a block { }
        //         is only accessible within that block.
        // =============================================================

        System.out.println("--- 1. Variable Scope in main ---");

        // 1a. Declare an int variable called `x` and set it to 10.

        // 1b. Declare a String variable called `name` and set it to your name.

        // TODO: Uncomment the lines below once you've declared the variables.
        // System.out.println("x is: " + x);
        // System.out.println("name is: " + name);

        // These variables are declared in main's block { }, so they can be
        // used anywhere in main from this point forward.


        System.out.println("\n--- 2. Scope Inside an if/else ---");

        // 2a. Write an if/else statement that checks if `x` is greater than 5.
        //     - Inside the if block, declare an int called `bonus` and set it to 20.
        //       Print "bonus inside if: " + bonus
        //     - Inside the else block, declare an int called `bonus` and set it to 0.
        //       Print "bonus inside else: " + bonus

        // 2b. Now, BELOW your if/else (not inside it), try uncommenting this line:
        // System.out.println("bonus outside if/else: " + bonus);

        // What happens? You should get a compiler error!
        // `bonus` was declared INSIDE the if/else blocks, so it does not exist out here.


        System.out.println("\n--- 3. Fixing the Scope Problem ---");

        // When you need a variable to exist AFTER a block, declare it BEFORE the block.

        // 3a. Declare an int called `result` and set it to 0.

        // 3b. Write an if/else that checks if `x` is greater than 5.
        //     - Inside the if block: set `result` to 100   (don't re-declare it, just assign!)
        //     - Inside the else block: set `result` to -1

        // TODO: Uncomment the line below
        // System.out.println("result after if/else: " + result);


        System.out.println("\n--- 4. Scope Inside a for Loop ---");

        // 4a. Write a for loop: for (int i = 0; i < 3; i++)
        //     Inside the loop, print "i = " + i

        // 4b. Now, BELOW your for loop, try uncommenting this line:
        // System.out.println("i after loop: " + i);

        // What happens? Compiler error! `i` was declared in the for loop header,
        // so it only exists inside the loop.


        System.out.println("\n--- 5. Accessing a Loop Variable After the Loop ---");

        // If you need the loop variable after the loop, declare it before.

        // 5a. Declare an int called `j` and set it to 0.

        // 5b. Write a for loop that uses `j` but does NOT redeclare it:
        //     for (j = 0; j < 5; j++)
        //     Inside the loop, print "j = " + j

        // TODO: Uncomment the line below
        // System.out.println("j after loop: " + j);
        // What value does `j` have? Think about it, then run the code to check.


        System.out.println("\n--- 6. Scope Inside a while Loop ---");

        // 6a. Write a while loop that runs 3 times (use a counter variable).
        //     Inside the loop, declare a String called `message` and set it to "Hello #" + counter.
        //     Print message inside the loop.
        //     Don't forget to increment your counter!

        // 6b. Now, BELOW your while loop, try uncommenting this line:
        // System.out.println("message after while: " + message);

        // Same story: `message` was declared inside the while block, so it
        // doesn't exist outside of it.


        System.out.println("\n--- 7. Shadowing (Tricky!) ---");

        // "Shadowing" is when a variable in an inner scope has the same name
        // as a variable in an outer scope. The inner one temporarily "hides"
        // the outer one.

        // TODO: Uncomment the lines below and predict what they print BEFORE running.
        // int num = 50;
        // System.out.println("num before block: " + num);
        // {
        //     int num2 = 999;
        //     System.out.println("  num inside block: " + num);
        //     System.out.println("  num2 inside block: " + num2);
        // }
        // System.out.println("num after block: " + num);

        // Can you access num2 here? Why or why not?
        // System.out.println("num2 after block: " + num2);


        System.out.println("\n--- 8. Putting It All Together ---");

        // 8. Declare an int variable called `total` set to 0.
        //    Write a for loop from 1 to 5.
        //    Inside the loop:
        //      - Declare an int called `doubled` and set it to the loop variable * 2
        //      - Add `doubled` to `total`
        //    After the loop, print "total: " + total

        // Q: Why can we access `total` after the loop but not `doubled`?

    }
}