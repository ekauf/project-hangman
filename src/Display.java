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

    public void displayHangmanArt(int lives) {
        if (lives == 0) {
            System.out.println("    ------------");
            System.out.println("    |/          |");
            System.out.println("    |          (u)");
            System.out.println("    |        ---|---");
            System.out.println("    |           |");
            System.out.println("    |         __|__ ");
            System.out.println("____|____");
        } else if (lives == 1) {
            System.out.println("    ------------");
            System.out.println("    |/          |");
            System.out.println("    |          (u)");
            System.out.println("    |        ---|---");
            System.out.println("    |           |");
            System.out.println("    |            ");
            System.out.println("____|____");

        } else if (lives == 2) {
            System.out.println("    ------------");
            System.out.println("    |/          |");
            System.out.println("    |          (u)");
            System.out.println("    |             ");
            System.out.println("    |            ");
            System.out.println("    |            ");
            System.out.println("____|____");
        } else if (lives == 3) {
            System.out.println("    ------------");
            System.out.println("    |/          |");
            System.out.println("    |            ");
            System.out.println("    |             ");
            System.out.println("    |            ");
            System.out.println("    |            ");
            System.out.println("____|____");
        } else if (lives == 4) {
            System.out.println("    ------      ");
            System.out.println("    |/          ");
            System.out.println("    |            ");
            System.out.println("    |             ");
            System.out.println("    |            ");
            System.out.println("    |            ");
            System.out.println("____|____");
        } else if (lives == 5) {

            System.out.println("    |         ");
            System.out.println("    |            ");
            System.out.println("    |             ");
            System.out.println("    |            ");
            System.out.println("    |            ");
            System.out.println("____|____");
        } else if (lives == 6) {

            System.out.println("    |            ");
            System.out.println("    |            ");
            System.out.println("____|____");
        } else if (lives == 7) {
            System.out.println("____|____");
        } else if (lives == 8) {
            System.out.println("    .oOOOOOOo.");
            System.out.println("  oO'        'Oo");
            System.out.println(" O'  O      O  'O");
            System.out.println("O                O");
            System.out.println("O       ()        O");
            System.out.println("O  Oo,      ,oO  O");
            System.out.println(" O.  'OOOOOO' .O");
            System.out.println("  Yb.        .dP");
            System.out.println("    'YOOOOOOP'");
        }
    }

}
