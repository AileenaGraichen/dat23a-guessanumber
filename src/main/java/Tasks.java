import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        int secretNumber = -1;
        int guessedNumber = -1;
        int numberOfGuesses = 0;
        boolean keepRunning = true;
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("====================================");
        System.out.println("\nWelcome to 'Guess A Number!'");
        System.out.println("\nI am thinking of a number between 1 and 10.\n");

        // Generate the secretNumber once at the beginning of the game
        secretNumber = random.nextInt(10) + 1;

        while (keepRunning == true && numberOfGuesses < 3) {
            numberOfGuesses++;
            System.out.println("[What  is  your  guess?]");
            guessedNumber = keyboard.nextInt();
            if (guessedNumber < secretNumber) {
                System.out.println("No, mine is higher.");
            } else if (guessedNumber > secretNumber) {
                System.out.println("No, mine is lower.");
            } else {
                System.out.println("Exactly! You're really good!");
                keepRunning = false;
            }
            System.out.println("You have " + (3 - numberOfGuesses) + " guesses left.");
        }
        System.out.println("\nThanks for playing! The correct number was: " + secretNumber);
    }
}
