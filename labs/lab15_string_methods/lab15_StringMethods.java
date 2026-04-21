public class lab15_StringMethods {
    public static void main(String[] args) throws Exception {

        System.out.println("\n--- Comparing Strings ---");
        // 1. Create two String variables:
        //    greeting1 = "Hello"
        //    greeting2 = "hello"

        // 2. Compare greeting1 and greeting2 using .equals() and print the result

        // 3. Compare `greeting1` and `greeting2` using .equalsIgnoreCase() and print the result


        System.out.println("\n--- String Length and Checking Contents ---");
        // 4. Create a String called sentence = "The quick brown fox JUMPS over the lazy dog"

        // 5. Use the method .length to:
            // Print the number of characters in `greeting1`
            // Print the number of characters in `sentence`

        // 6. Check if `sentence` contains "fox" using .contains() and print the result

        // 7. Check if `sentence` contains "Fox" and print the result

        // 8. Create an empty String called `blank` and set it equal to two double quotes: ""
        //    Check if `blank` is empty using .isEmpty() and print the result
        //    Check if `greeting1` is empty using .isEmpty() and print the result


        System.out.println("\n--- Starts With and Ends With ---");
        // 9. Check if `sentence` starts with "The" using .startsWith() and print the result

        // 10. Check if `sentence` ends with "dog" using .endsWith() and print the result

        // 11. Check if `sentence` starts with "the" (lowercase) — and print the result. Does this make sense?


        System.out.println("\n--- Changing Case ---");
        // 12. Print `sentence` in all uppercase using .toUpperCase()

        // 13. Print `sentence` in all lowercase using .toLowerCase()

        // 14. Now check if sentence.toLowerCase() starts with "the" — does it work now?


        System.out.println("\n--- Replacing and Trimming ---");

        // 15. Replace "fox" with "cat" in sentence using .replace() and print the result
        System.out.println(sentence.replace("fox", "cat"));

        // 16. Create a String called messy using the line below (uncomment it)
        //     String messy = "   extra spaces in front and at end   ";

        // 17. Print messy, then print messy.trim(). What does trim() do?


        System.out.println("\n--- Splitting a String ---");
        // 18. Create a String called csv = "red,blue,green,yellow"

        // 19. Split `csv` by "," (comma) into a String array called `colors` using .split()

        // 20. Use a for-each loop to print each color on its own line
        //     Expected output:
        //              red
        //              blue
        //              green
        //              yellow

        // 21. Split `sentence` by " " into a String array called `words`
        //     Print how many words are in the sentence using the array's .length
        //     Expected output: 9

    }
}
