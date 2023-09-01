import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        final int MAX_GUESSES = 3;
        int secretNumber;
        int guessedNumber;
        int numberOfGuesses = 0;
        boolean keepRunning = true;
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("====================================================");
        System.out.println("\n=   Welcome to 'Guess A Number!'                   =");
        System.out.println("\n=   I am thinking of a number between 1 and 10.    =\n");

        secretNumber = random.nextInt(10) + 1;

        do {
            numberOfGuesses++;
            System.out.print("=   Enter your guess: ");

            try {
                guessedNumber = keyboard.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("=   Invalid input. Please enter a number.");
                keyboard.nextLine(); // Clear the invalid input
                continue;
            }

            if (guessedNumber < secretNumber) {
                System.out.println("\n=   Your guess is too low. Try a higher number.");
            } else if (guessedNumber > secretNumber) {
                System.out.println("\n=   Your guess is too high. Try a lower number.");
            } else {
                System.out.println("\n=   [YAY! YOU'VE GOT IT!]");
                keepRunning = false;
            }

            System.out.println("=   You have " + (MAX_GUESSES - numberOfGuesses) + " guesses left.\n");
        } while (keepRunning && numberOfGuesses < MAX_GUESSES);

        System.out.println("\n=   Thanks for playing! The correct number was: [" + secretNumber + "]");
    }
}

