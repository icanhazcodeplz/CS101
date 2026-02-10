// TODO: Import java Scanner

public class lab5BooleansConditionals {
    public static void main(String[] args) {
        System.out.println("\nCS101 - Lab5: Booleans and Conditionals");
        System.out.println("\n--- Boolean Variables ---");

        // 1. Create a boolean variable called `isSunny` and set it to true

        // TODO: Uncomment the line below
        // System.out.println("isSunny: " + isSunny);

        // 2. Create a boolean variable called `isWeekend` and set it to false

        // TODO: Uncomment the line below
        // System.out.println("isWeekend: " + isWeekend);

        System.out.println("\n--- Logical Operators (AND, OR, NOT) ---");

        // 3. Create a boolean variable called `andResult` and set it to: `isSunny` AND `isWeekend`
        //    Hint: the AND operator is &&

        // TODO: Uncomment the line below
        // System.out.println("isSunny AND isWeekend: " + andResult);

        // 4. Create a boolean variable called `orResult` and set it to: `isSunny` OR `isWeekend`
        //    Hint: the OR operator is ||

        // TODO: Uncomment the line below
        // System.out.println("isSunny OR isWeekend: " + orResult);

        // 5. Create a boolean variable called `notResult` and set it to: NOT `isSunny`
        //    Hint: the NOT operator is !

        // TODO: Uncomment the line below
        // System.out.println("NOT isSunny: " + notResult);

        System.out.println("\n--- Comparison Operators ---");

        // 6. Create an int variable called `x` and set it to 5

        // 7. Create an int variable called `y` and set it to 6

        // 8. Create an int variable called `z` and set it to 7

        // TODO: Uncomment the lines below one at a time. Try to predict what it will print before running the code!
        // System.out.println("x = " + x + "  |  y = " + y + "  |  z = " + z);
        // System.out.println("x > y: " + (x > y));
        // System.out.println("x < z: " + (x < z));
        // System.out.println("x == z: " + (x == z));
        // System.out.println("x != x: " + (x != x));


        // 9. Create a boolean variable called `zGTy` and set it to (z > y).
        // "GT" is often used as shorthand for "greater than"

        // TODO: Uncomment the line below
        // System.out.println("zGTy : " + zGTy);

        // 10. Create a boolean variable called `yGTEz` and set it to (y >= z)
        // "GTE" is often used as shorthand for "greater than or equals to"

        // TODO: Uncomment the line below
        // System.out.println("yGTEz : " + yGTEz);

        // 11. Create a boolean variable called `both` and set it to: (z > y) AND (y >= z)

        // TODO: Uncomment the line below
        // System.out.println("both : " + both);

        // 12. Create a boolean variable called `bothVars` and set it to: `zGTy` AND `yGTEz`


        // TODO: Uncomment the line below
        // System.out.println("bothVars : " + bothVars);


        // 13. Experiment with changing the values of x, y and z above. See if you can predict what will be printed!
        // TODO: Change the values of x, y, z back to their original values



        System.out.println("\n--- if/else Statements ---");

        // 14. Write an if/else statement: if isSunny is true, print "It's sunny"
        //    otherwise, print "It's not sunny"
        //    Example:
        //        if (<condition>) {
        //            System.out.println("condition is true");
        //        } else {
        //            System.out.println("condition is false");
        //        }


        // 15. Write an if/else statement: if x is greater than y, print "x is greater than y"
        //    otherwise, print "y is greater than or equal to x"


        // 16. Experiment with changing the values of x, y, z and isSunny. See if you can predict what will be printed!
        // TODO: Change the values of x, y, z back to their original values

        System.out.println("\n--- if/elseIf/else Statements---");

        // 17. Create a Scanner object called "scanner" to read input from the user


        // TODO: Uncomment the line below
        // System.out.print("\nEnter the temperature: ");

        // 18. Create an int variable called "temp" and use scanner.nextInt() to read the user's input


        // 19. Write an if / elseIf / else chain for the temperature:
        //     - if temp is 50 or above, print "Warm for winter!"
        //     - else if temp is 32 or above, print "It's weird, but this feels warm"
        //     - else if temp is 10 or above, print "Brrrrrrr"
        //     - else, print "My snot froze"
        //    Example:
        //        if (<condition1>) {
        //            ...
        //        } else if (<condition2>) {
        //            ...
        //        } else {
        //            ...
        //        }


        // 20: Run the program a few times, inputting different values for the temperature to test that your code is working as expected
        // TIP: Make sure to test the outcome if you input EXACTLY 50, 32, or 10. What do we expect based on the wording in 19?

        // TODO: Uncomment the line below
        // System.out.print("\nIs it precipitating? [true/false]: ");

        // 21. Create a boolean variable called "isPrecipitating" and use scanner.nextBoolean() to read the user's input


        // 22. Write an if / elseIf / else chain:
        //     - if temperature is at or below 32 AND isPrecipitating is true, print "Snow is so pretty :)"
        //     - else if temperature is above 32 AND isPrecipitating is true, print "Umbrella time"
        //     - else if temperature is at or below 32, print "Look out for ice!"
        //     - else, print "Shorts and T-shirt weather"

        // 10% EXTRA CREDIT: Redo 22, but use nested if statements instead of an if/elseIf chain

    }
}
