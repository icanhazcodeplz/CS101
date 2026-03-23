import java.util.Scanner;
import java.util.Random;

/**
 * A turn-based Pikachu battle game where the player and an enemy Pikachu
 * take turns attacking each other until one faints.
 */
public class hw4PikachuBattle {

    /**
     * Runs the main game loop. The player and enemy take turns choosing
     * attacks and dealing damage until one Pikachu's health reaches 0.
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Print welcome message and instructions
        // TODO

        // Both Pikachu start with 100 health
        int myHealth = 100;
        int enemyHealth = 100;

        // Main game loop - continues until one Pikachu faints
        while (true) {

            // --- PLAYER'S TURN ---
            // TODO:
            //    - Get player's choice using `getChoice`
            //    - Calculate damage using `getDamage`
            //    - Call `printAttackResult`
            //    - Reduce `enemyHealth`

            // Check if enemy fainted
            if (enemyHealth <= 0) {
                System.out.println("Enemy PIKACHU fainted!");
                break;
            }
            System.out.println("Enemy PIKACHU's health: " + enemyHealth);
            Thread.sleep(2000);  // Pause for dramatic effect

            // --- ENEMY'S TURN ---
            // TODO:
            //    - Get enemy's choice (a random integer either 1 or 2)
            //    - Print which attack the enemy chose
            //    - Calculate damage using `getDamage`
            //    - Call `printAttackResult`
            //    - Reduce `myHealth`

            // Check if player's Pikachu fainted
            if (myHealth <= 0) {
                System.out.println("Your PIKACHU fainted!");
                break;
            }
            System.out.println("Your PIKACHU's health: " + myHealth);
            Thread.sleep(2000);  // Pause for dramatic effect
        }

    }

    /**
     * Prompts the player to choose an attack move.
     * Keeps asking until a valid choice (1 or 2) is entered.
     *
     * @param scanner  the Scanner object for reading user input
     * @return         the player's choice: 1 for Thunderbolt, 2 for Thunder
     */
    public static int getChoice(Scanner scanner) {
        // TODO:
        //    - Give the user a prompt explaining what to do
        //    - Use `scanner` to get the user's choice (either 1 or 2)

        // TODO:
        //    - If the choice was invalid (must be 1 or 2), use a while loop to keep prompting the user for their input

        // TODO: Return the user choice. This `return 1` is just a placeholder so the code compiles.
        return 1;
    }

    /**
     * Converts an attack number to its name.
     *
     * @param attackInt  the attack number (1 or 2)
     * @return           "Thunderbolt" for 1, "Thunder" for 2, or "" if invalid
     */
    public static String getAttackName(int attackInt) {
        // TODO:
        //    - Return "Thunderbolt" if `attackInt` is 1
        //    - Return "Thunder" if `attackInt` is 2
        //    - Otherwise return ""

        // TODO: Return the attack name. This `return ""` is just a placeholder so the code compiles.
        return "";
    }

    /**
     * Calculates the damage for an attack, accounting for randomness and miss chance.
     * - Thunderbolt (choice 1): 15-25 damage, 10% chance to miss
     * - Thunder (choice 2): 25-35 damage, 30% chance to miss
     *
     * @param choice  the attack number (1 or 2)
     * @return        the damage dealt, or 0 if the attack missed
     */
    public static int getDamage(int choice) {
        // TODO:
        //    - If choice is 1 (Thunderbolt): 10% chance to miss, otherwise random damage between 15 and 25
        //    - If choice is 2 (Thunder): 30% chance to miss, otherwise random damage between 25 and 35
        //    - If the attack misses, return 0
        //    - Otherwise, return the damage

        // TODO: Return the damage. This `return 0` is just a placeholder so the code compiles.
        return 0;
    }

    /**
     * Prints whether the attack hit or missed, and how much damage it did.
     *
     * @param attackInt  the attack number (1 or 2)
     * @param damage     the damage dealt (0 means the attack missed)
     */
    public static void printAttackResult(int attackInt, int damage) {
        // TODO:
        //    - Use `getAttackName` to get the name of the attack
        //    - If damage is 0, print that the attack missed (e.g. "Thunderbolt missed!")
        //    - Otherwise, print how much damage it did (e.g. "Thunderbolt did 20 damage")
    }

}