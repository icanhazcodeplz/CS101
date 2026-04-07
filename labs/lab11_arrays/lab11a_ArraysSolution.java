// TODO: import java.util.Arrays;
import java.util.Arrays;
public class lab11a_ArraysSolution {
    public static void main(String[] args) {

        System.out.println("\n--- Creating Arrays ---");
        // 1. Create an int array called `numbers` that holds the values 10, 20, 30, 40, 50
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Print the entire array using: System.out.println(Arrays.toString(numbers))
        //    (This is a handy trick for printing arrays!)
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n--- Accessing Elements ---");
        // 3. Print the first element of `numbers`
        //    Remember: arrays start at index 0
        System.out.println(numbers[0]);

        // 4. Print the length of the array
        //    Hint: use `numbers.length`
        System.out.println(numbers.length);

        // 5. Print the last element of `numbers`
        //    Hint: use `numbers.length - 1` to get the last index
        System.out.println(numbers[numbers.length - 1]);


        System.out.println("\n--- Modifying Elements ---");
        // 6. Change the second element (index 1) of `numbers` to 99
        numbers[1] = 99;

        // 7. Print the array again to verify the change
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n--- Looping Through an Array (for loop) ---");
        // 8. Write a for loop that prints every element of `numbers`, one per line
        //    Hint: loop from i = 0 to i < numbers.length
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\n--- Looping Through an Array (for-each loop) ---");
        // A for-each loop is a simpler way to loop through an array.
        // Syntax:
        //   for (<type> <varInLoop> : <nameOfArray>) {
        //       // `varInLoop` is the current element
        //   }

        // 9. Use a for-each loop to print every element of `numbers`, one per line
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\n--- Sum of an Array ---");
        // 10. Create an int variable called `sum` and set it to 0
        int sum = 0;

        // 11. Use a for-each loop to add up all the elements in `numbers`
        for (int num : numbers) {
            sum += num;
        }

        // TODO: Uncomment the line below
        System.out.println("Sum: " + sum);

        System.out.println("\n--- Finding the Max ---");
        // 12. Create an int variable called `max` and set it to `numbers[0]`
        int max = numbers[0];

        // 13. Write a for loop (starting at index 1) that checks each element.
        //     If the element is greater than `max`, update `max`.
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // TODO: Uncomment the line below
        System.out.println("Max: " + max);

        System.out.println("\n--- String Array ---");
        // 14. Create a String array called `colors` with the values: "red", "green", "blue", "yellow"
        String[] colors = {"red", "green", "blue", "yellow"};

        // 15. Use a for-each loop to print each color on its own line
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("\n--- Building an Array with a Loop ---");
        // 16. Create an empty int array called `squares` with a length of 5 (don't fill in values yet)
        int[] squares = new int[5];

        // 17. Write a for loop that sets each element to the square of its index
        //     For example: squares[0] = 0, squares[1] = 1, squares[2] = 4, squares[3] = 9, squares[4] = 16
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }

        // 18. Print the array using 'Arrays.toString'
        System.out.println(Arrays.toString(squares));

        System.out.println("\n--- EXTRA CREDIT: Reverse an Array ---");
        // 5% EXTRA CREDIT: Create a new int array called `reversed` with the same length as `numbers`.
        //     Use a for loop to fill `reversed` with the elements of `numbers` in reverse order.
        //     Then print `reversed` using Arrays.toString().
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversed));

    }
}
