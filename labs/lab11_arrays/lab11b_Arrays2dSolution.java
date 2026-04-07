public class lab11b_Arrays2dSolution {
    public static void main(String[] args) {

        System.out.println("\n--- Creating a 2D Array ---");
        // 1. Create a 2D String array called `starters` with 2 rows, 3 columns:
        //    Row 1: "Bulbasaur", "Charmander", "Squirtle"
        //    Row 2: "Chikorita", "Cyndaquil", "Totodile"
        String[][] starters = {
                {"Bulbasaur", "Charmander", "Squirtle"},
                {"Chikorita", "Cyndaquil", "Totodile"},
        };

        System.out.println("\n--- Accessing 2D Array Elements ---");
        // 2. Print the element at row 1, column 2 (should be "Charmander")
        System.out.println(starters[0][1]);

        // 3. Print the element at row 2, column 3 (should be "Totodile")
        System.out.println(starters[1][2]);

        // 4. Print the number of rows
        System.out.println(starters.length);

        // 5. Print the number of columns in the first row
        System.out.println(starters[0].length);

        System.out.println("\n--- Looping Through a 2D Array ---");
        // 6. Use nested for loops to print every element of `starters`
        //    Print each row on its own line, with elements separated by ", "
        //    Expected output:
        //      Bulbasaur, Charmander, Squirtle,
        //      Chikorita, Cyndaquil, Totodile,
        //    Hint: use System.out.print() for elements and System.out.println() at the end of each row
        for (int r=0; r < starters.length; r++) {
            for (int c = 0; c < starters[r].length; c++) {
                System.out.print(starters[r][c] + ", ");
            }
            System.out.println();
        }


        System.out.println("\n--- Creating a multiplication array ---");
        // 7. Create an empty 3x5 int array called `multiplication`
        int[][] multiplication = new int[3][5];

        // 8. Use nested for loops to fill it so that multiplication[r][c] = (r + 1) * (c + 1)
        //    This creates a multiplication table:
        //      1  2  3  4   5
        //      2  4  6  8   10
        //      3  6  9  12  15
        for (int r=0; r < multiplication.length; r++) {
            for (int c = 0; c < multiplication[r].length; c++) {
                multiplication[r][c] = (r + 1) * (c + 1);
            }
        }

        // 9. Use nested for loops to print the multiplication table
        //    Optional: use System.out.print(multiplication[r][c] + "\t") for tab spacing
        for (int r=0; r < multiplication.length; r++) {
            for (int c = 0; c < multiplication[r].length; c++) {
                System.out.print(multiplication[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
