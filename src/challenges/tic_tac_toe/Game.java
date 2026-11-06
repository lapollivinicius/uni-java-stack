package src.challenges.tic_tac_toe;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    Symbols[][] symbols = new Symbols[3][3];
    Symbols currentPlayer = Symbols.X;
    Board board = new Board();

    public void start() {
        for (Symbols[] symbolArr : symbols) {
            Arrays.fill(symbolArr, Symbols.E);
        }

        while (true) {
            String cords = input();

            int x = Integer.parseInt(cords.split(",")[0]);
            int y = Integer.parseInt(cords.split(",")[1]);

            if (symbols[x][y].equals(Symbols.X) || symbols[x][y].equals(Symbols.O)) {
                System.out.println("already placed");
                continue;
            }

            symbols[x][y] = currentPlayer;
            currentPlayer = currentPlayer.next();

            Symbols winner = winner();

            if (winner != null) {
                System.out.println(winner.getValue());
                System.exit(1);
            }

            board.add(symbols);
            board.show();
        }

    }

    public String input() {
        System.out.printf("%s play (x, y) -> ", currentPlayer.getValue());
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public Symbols winner() {

        /*
        * 1 2 3
        * 4 5 6
        * 7 8 9
        *
        * 1 5 9
        * 3 5 7
        *
        * 1 4 7
        * 2 5 8
        * 3 6 9
        *
        * */

        return null;

    }



}
