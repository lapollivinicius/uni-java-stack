package src.challenges.tic_tac_toe;

public class Board {

    StringBuilder board;

    public void add(Symbols[][] symbols) {
        board = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.append(symbols[i][j].getValue());
                if (j < 2) board.append(" | ");
            }
            board.append("\n");
        }
    }

    public void show() {
        System.out.println(board);
    }

}
