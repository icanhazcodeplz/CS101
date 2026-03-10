import java.util.Scanner;
public class lab9guessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        while (userGuess != 8) {
            userGuess = scanner.nextInt();
        }
        /*
        TODO: Improve this game by completing the following tasks:
          1. Add a prompt to tell the user how to play the game. Restrict the game to be between
             two numbers of your choosing (for example, "Pick a number between 1 and 10").
          2. Add print statements such that the user is informed of the following situations:
               - The guess was correct
               - The guess was invalid (outside of the range you have decided)
               - The guess was too low
               - The guess was too high
          3. Keep track of the number of times the user guesses and print the count after they win
          4. Instead of a hard-coded secret number, use a randomly generated one so that it
             is different each time the program is run.
         */

    }
}
