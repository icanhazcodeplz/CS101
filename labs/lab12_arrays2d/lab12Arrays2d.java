public class lab132dArrays {
    public static void main(String[] args) {

        System.out.println("\n--- Creating a 2D Array ---");
        // A 2D array is an array of arrays — like a grid with rows and columns.
        // Syntax:
        //   int[][] grid = {
        //       {1, 2, 3},
        //       {4, 5, 6}
        //   };
        // This creates a 2x3 grid (2 rows, 3 columns).

        // 1. Create a 2D String array called `starters` with 3 rows (one per generation):
        //    Row 0: "Bulbasaur", "Charmander", "Squirtle"
        //    Row 1: "Chikorita", "Cyndaquil", "Totodile"
        //    Row 2: "Treecko", "Torchic", "Mudkip"

        System.out.println("\n--- Accessing 2D Array Elements ---");
        // Access elements with [row][column].
        // For example: starters[0][0] is "Bulbasaur", starters[1][2] is "Totodile"

        // 2. Print the element at row 0, column 1 (should be "Charmander")

        // 3. Print the element at row 2, column 2 (should be "Mudkip")

        // 4. Print the number of rows
        //    Hint: starters.length

        // 5. Print the number of columns in the first row
        //    Hint: starters[0].length

        System.out.println("\n--- Looping Through a 2D Array ---");
        // To loop through a 2D array, use nested for loops:
        //   for (int row = 0; row < grid.length; row++) {
        //       for (int col = 0; col < grid[row].length; col++) {
        //           // access grid[row][col]
        //       }
        //   }

        // 6. Use nested for loops to print every element of `starters`
        //    Print each row on its own line, with elements separated by ", "
        //    Expected output:
        //      Bulbasaur, Charmander, Squirtle
        //      Chikorita, Cyndaquil, Totodile
        //      Treecko, Torchic, Mudkip
        //    Hint: use System.out.print() for elements and System.out.println() at the end of each row

        System.out.println("\n--- Creating an Empty 2D Array ---");
        // You can also create an empty 2D array with a specific size:
        //   int[][] grid = new int[rows][columns];

        // 7. Create a 3x3 int array called `multiplication`

        // 8. Use nested for loops to fill it so that multiplication[r][c] = (r + 1) * (c + 1)
        //    This creates a multiplication table:
        //      1  2  3
        //      2  4  6
        //      3  6  9

        // 9. Use nested for loops to print the multiplication table
        //    Hint: use System.out.print(multiplication[r][c] + "\t") for tab spacing

    }
}
