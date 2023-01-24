import java.util.ArrayList;

public class Display {

    public boolean displayWord (String word, ArrayList<Character> guesses) {
        boolean guessed = true;
        for (int i = 0; i < word.length(); i++) {
            if (guesses.contains(Character.toLowerCase(word.charAt(i)))) {
                System.out.println(word.charAt(i) + " ");
            } else {
                guessed = false;
                System.out.println("_ ");
            }
        }
        System.out.println();
        return guessed;
    }


    public void displayGuesses(ArrayList<Character> guesses) {
        System.out.println("Letters guessed: ");
        for (char c : guesses) {
            System.out.println(c + " ");
        }
        System.out.println();
    }

    public void displayLives(int lives) {
        System.out.println("Lives: " + lives);
    }


}
