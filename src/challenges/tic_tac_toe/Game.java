package src.challenges.tic_tac_toe;

import java.util.Scanner;

public class Game {

    Symbols current = Symbols.X;
    Board board = new Board();

    public void start() {

        while (true) {

            String cords = input();

            int x = Integer.parseInt(cords.split(",")[0]) - 1;
            int y = Integer.parseInt(cords.split(",")[1]) - 1;

            try {
                current = board.update(x, y, current);
            } catch(Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            board.show();
            boolean hasWinner = checkWinner();
            if(hasWinner) return;
        }
    }

    public String input() {
        System.out.printf("%s play (row, col) -> ", current.getValue());
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        if (input.equals("exit")) exit("there is no winner");
        return input;
    }

    public boolean checkWinner() {

        if (board.isFull()) {
            exit("it's draw, there is no winner");
        }

        Symbols[] results = {
                board.checkRows(),
                board.checkCols(),
                board.checkAngles()
        };

        for (Symbols winner : results) {
            if (winner != null) {
                exit(String.format("%s is the winner\n", winner));
                return true;
            }
        }

        return false;
    }

    public void exit(String message) {
        System.out.println(message);
        System.exit(1);
    }


}
