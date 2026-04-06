// TODO: import java.util.ArrayList;
// TODO: import java.io.File;
// TODO: import java.util.Scanner;
public class lab12FileScannerArrayList {
    public static void main(String[] args) throws Exception {

        // ============================
        // PART 1: ArrayList Basics
        // ============================

        System.out.println("\n--- Creating an ArrayList ---");
        // An ArrayList is like an array, but it can grow and shrink in size.
        // Syntax:
        //   ArrayList<Type> name = new ArrayList<Type>();
        //
        // Note: ArrayLists only work with object types (String, Integer, Double),
        //       not primitives (int, double). Use `Integer` instead of `int`, etc.

        // 1. Create an ArrayList of Strings called `pokemon` and add the following:
        //    "Pikachu", "Charmander", "Squirtle"
        //    Hint: use the .add() method. e.g. pokemon.add("Pikachu");

        // 2. Print the ArrayList
        //    Hint: you can print an ArrayList directly with System.out.println(pokemon)

        System.out.println("\n--- Accessing and Modifying ---");
        // 3. Print the first element of `pokemon`
        //    Hint: use .get(0)

        // 4. Print the size of the ArrayList
        //    Hint: use .size() (note: this is a method, not a property like array's .length)

        // 5. Change the second element to "Bulbasaur"
        //    Hint: use .set(1, "Bulbasaur")

        // 6. Print the ArrayList again to see the change

        System.out.println("\n--- Adding and Removing ---");
        // 7. Add "Eevee" to the end of the list

        // 8. Remove "Squirtle" from the list
        //    Hint: use .remove("Squirtle")

        // 9. Print the ArrayList and its size

        System.out.println("\n--- Looping Through an ArrayList ---");
        // 10. Use a for-each loop to print each Pokémon on its own line
        //     Hint: for (String p : pokemon) { ... }

        // 11. Use a regular for loop (with index) to print each Pokémon with its index
        //     Expected output: "0: Pikachu", "1: Bulbasaur", etc.
        //     Hint: loop from i = 0 to i < pokemon.size()

        System.out.println("\n--- Searching an ArrayList ---");
        // 12. Check if "Eevee" is in the list and print the result
        //     Hint: use .contains("Eevee") — this returns a boolean

        // 13. Find the index of "Eevee" and print it
        //     Hint: use .indexOf("Eevee") — returns -1 if not found


        // ============================
        // PART 2: Reading a File into an ArrayList
        // ============================

        System.out.println("\n--- Reading pokemon.txt ---");
        // A Scanner can read from a File just like it reads from System.in.
        // Syntax:
        //   File file = new File("filename.txt");
        //   Scanner fileScanner = new Scanner(file);
        //   while (fileScanner.hasNextLine()) {
        //       String line = fileScanner.nextLine();
        //   }

        // 14. Create a File object for "pokemon.txt"

        // 15. Create a Scanner that reads from the file

        // 16. Create a new ArrayList<String> called `allPokemon`

        // 17. Use a while loop to read every line from the file and add it to `allPokemon`
        //     Hint: use fileScanner.hasNextLine() and fileScanner.nextLine()

        // 18. Close the Scanner
        //     Hint: fileScanner.close()

        // TODO: Uncomment the line below
        //System.out.println("Total Pokémon loaded: " + allPokemon.size());

        System.out.println("\n--- First 5 Pokémon ---");
        // 19. Use a for loop to print the first 5 elements of `allPokemon`

        System.out.println("\n--- Last 5 Pokémon ---");
        // 20. Use a for loop to print the last 5 elements of `allPokemon`
        //     Hint: start at allPokemon.size() - 5


        // ============================
        // PART 3: Reading a CSV File
        // ============================

        System.out.println("\n--- Reading pokemon.csv ---");
        // CSVParser.splitCSVLine(line) takes a line from a CSV file and returns
        // an ArrayList<String> of the columns. For pokemon.csv the columns are:
        //   index 0: name
        //   index 1: type (e.g. "Fire" or "Water/Flying")
        //   index 2: generation (e.g. "1")

        // 21. Create a File object for "pokemon.csv" and a Scanner to read it

        // 22. Skip the header row
        //     Hint: call .nextLine() once before the loop

        // 23. Create three ArrayLists: `names` (String), `types` (String), `generations` (String)

        // 24. Use a while loop to read each line, split it with CSVParser.splitCSVLine(),
        //     and add each column to the appropriate ArrayList

        // 25. Close the Scanner

        // TODO: Uncomment the line below
        //System.out.println("Total Pokémon in CSV: " + names.size());

        System.out.println("\n--- Count Fire Types ---");
        // 26. Count how many Pokémon have "Fire" somewhere in their type
        //     Hint: use a for-each loop and the .contains("Fire") method on each type String

        // TODO: Uncomment the line below
        //System.out.println("Fire type Pokémon: " + fireCount);

        System.out.println("\n--- Count Gen 1 Pokémon ---");
        // 27. Count how many Pokémon are from generation 1
        //     Hint: use .equals("1") to compare Strings

        // TODO: Uncomment the line below
        //System.out.println("Gen 1 Pokémon: " + gen1Count);

        System.out.println("\n--- Find a Pokémon ---");
        // 28. Search for "Pikachu" in the `names` ArrayList.
        //     If found, print its name, type, and generation.
        //     Hint: use .indexOf("Pikachu") to get the index, then use that
        //           index to look up the type and generation from the other ArrayLists.

        System.out.println("\n--- EXTRA CREDIT: Most Common Type ---");
        // 5% EXTRA CREDIT: Find and print which single type (e.g. "Water", "Fire", "Grass")
        //     appears most often. For dual types like "Water/Flying", count both
        //     "Water" and "Flying" separately.
        //     Hint: You could use .split("/") to break dual types into individual types.

    }
}
