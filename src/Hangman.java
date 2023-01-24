import java.util.ArrayList;
import java.util.Scanner;


public class Hangman {
    public static void main(String[] args) {

        WordBank wordBank = new WordBank();
        Display display = new Display();
        PlayerInteraction playerInteraction = new PlayerInteraction();

        System.out.println("Welcome to Hangman: Animal. Guess the animal or hang!");
        String word = wordBank.getRandomWord();
        ArrayList<Character> guesses = new ArrayList<>();
        int lives = 8;
        boolean playAgain = true;

        while (playAgain) {
        while (lives > 0) {
            char guess = playerInteraction.getGuess();

            if (!Character.isLetter(guess)) {
                System.out.println("That ain't right captain. Please enter a letter.");
                continue;
            } else if (guesses.contains(guess)) {
                System.out.println("DUH! You already guessed that letter. PLease enter a new letter.");
                continue;
            }
            guesses.add(guess);
            if (word.toLowerCase().contains(String.valueOf(guess))) {
                System.out.println("Bang on target! The letter " + guess + " is in the word.");
            } else {
                System.out.println("Yikes! That's wrong. The letter " + guess + " is NOT in the word.");
                lives--;
            }

            display.displayWord(word, guesses);
            display.displayGuesses(guesses);
            display.displayLives(lives);

            if (display.displayWord(word, guesses)) {
                System.out.println("NICE!!! You guessed the animal right: " + word + ".");
                break;
            }
        }

        if (lives <= 0) {
            System.out.println("You Failed! The animal was " + word + ".");
        }

            System.out.println("Fancy another go? (yes/no)");
            Scanner SCANNER = new Scanner(System.in);
            String playAgainInput = SCANNER.nextLine();
            if (playAgainInput.equalsIgnoreCase("yes")) {
                word = wordBank.getRandomWord();
                guesses.clear();
                lives = 8;
            } else {
                playAgain = false;
                System.out.println("Thanks for playing.");
            }
        }

    }
}