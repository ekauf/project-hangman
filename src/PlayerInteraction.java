import java.util.Scanner;

public class PlayerInteraction {
    private final Scanner input = new Scanner(System.in);

    private char guess;

    public void setGuess(char guess) {
        this.guess = guess;
    }

    public char getGuess() {
        System.out.println("Enter a letter: ");
        guess = input.next().charAt(0);
        return Character.toLowerCase(guess);
    }


}
