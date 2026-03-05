import java.util.Scanner;
public class guessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        while (userGuess != 8) {
            userGuess = scanner.nextInt();
        }
        /*
        How can we improve this game?
         - "Guess a number!"
         - Some range
         - Too high/ too low
         - Count guesses
         - Random secret
         - Range as variables
         - Do While instead of while
         */

    }
}
