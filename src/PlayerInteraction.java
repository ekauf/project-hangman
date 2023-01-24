import java.util.Scanner;

public class PlayerInteraction {
    private final Scanner input = new Scanner(System.in);


        public char getGuess() {
        System.out.println("Enter a letter: ");
        char guess = input.next().charAt(0);
        return Character.toLowerCase(guess);
    }


}
