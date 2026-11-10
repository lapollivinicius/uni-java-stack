package src.challenges.hangman_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    public void start() {

        List<String> letters = new ArrayList<>();
        String word = Words.getWord();
        int chances = word.length() * 2;

        while (true) {

            if (chances == 0) exit(String.format("THE WORD WAS %s \n", word));

            String character = input();
            String placeholder = Words.updatePlaceholder(character, letters, word);
            if (placeholder == null) {
                System.out.println("\033[1;31mLETTER HAS ALREADY BEEN USED\033[0m");
                continue;
            };

            System.out.printf("\033[34m%s\033[0m\n", placeholder);

            boolean isWin = Words.checkWord(letters, word);
            if (isWin) {
                exit("\033[93mYOU GOT IT\033[0m");
                break;
            };

            System.out.printf("YOU HAVE %d CHANCES \n", --chances);

        }

    }

    public String input() {
        System.out.print("\033[0;33mSOME LETTER -> \033[0m ");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public void exit(String message) {
        System.out.println(message);
        System.exit(1);
    }

}
