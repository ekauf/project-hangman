import java.util.Scanner;

public class PlayerInteraction {
    private Scanner input = new Scanner(System.in);
    public char getGuess() {
        System.out.println("Enter a letter: ");
        return input.next().charAt(0);
    }
}
