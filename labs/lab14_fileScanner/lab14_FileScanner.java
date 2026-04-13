// TODO: import java.util.ArrayList;
// TODO: import java.io.File;
// TODO: import java.util.Scanner;
public class lab14_FileScanner {
    public static void main(String[] args) throws Exception {

        System.out.println("\n--- Reading pokemon.txt ---");
        // A Scanner can read from a File just like it reads from System.in.
        // Syntax:
        //   File file = new File("filename.txt");
        //   Scanner fileScanner = new Scanner(file);
        //   while (fileScanner.hasNextLine()) {
        //       String line = fileScanner.nextLine();
        //   }

        // 1. Create a File object for "pokemon.txt"

        // 2. Create a Scanner that reads from the file

        // 3. Create a new ArrayList<String> called `allPokemon`

        // 4. Use a while loop to read every line from the file and add it to `allPokemon`
        //     Hint: use fileScanner.hasNextLine() and fileScanner.nextLine()

        // 5. Close the Scanner
        //     Hint: fileScanner.close()

        // TODO: Uncomment the line below
        //System.out.println("Total Pokémon loaded: " + allPokemon.size());

        System.out.println("\n--- First 5 Pokemon ---");
        // 6. Use a for-loop to print the first 5 elements of `allPokemon`

        System.out.println("\n--- Last 5 Pokemon ---");
        // 7. Use a for-loop to print the last 5 elements of `allPokemon`
        //     Hint: start at allPokemon.size() - 5


        System.out.println("\n--- Reading pokemon.csv ---");
        // CSVParser.splitCSVLine(line) takes a line from a CSV file and returns
        // an ArrayList<String> of the columns. For pokemon.csv the columns are:
        //   index 0: name
        //   index 1: type (e.g. "Fire" or "Water/Flying")
        //   index 2: generation (e.g. "1")

        // 8. Create a File object for "pokemon.csv" and a Scanner to read it

        // 9. Skip the header row
        //     Hint: call .nextLine() once before the loop

        // 10. Create three ArrayLists: `names` (String), `types` (String), `generations` (String)

        // 11. Use a while loop to read each line, split it with CSVParser.splitCSVLine(),
        //     and add each column to the appropriate ArrayList

        // 12. Close the Scanner

        // TODO: Uncomment the line below
        //System.out.println("Total Pokémon in CSV: " + names.size());

        System.out.println("\n--- Count Fire Types ---");
        // 13. Count how many Pokémon have "Fire" somewhere in their type
        //     Hint: use a for-each loop and the .contains("Fire") method on each type String

        // TODO: Uncomment the line below
        //System.out.println("Fire type Pokémon: " + fireCount);

        System.out.println("\n--- Count Gen 1 Pokemon ---");
        // 14. Count how many Pokémon are from generation 1
        //     Hint: use .equals("1") to compare Strings

        // TODO: Uncomment the line below
        //System.out.println("Gen 1 Pokémon: " + gen1Count);

        System.out.println("\n--- Find a Pokemon ---");
        // 15. Search for "Pikachu" in the `names` ArrayList.
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
