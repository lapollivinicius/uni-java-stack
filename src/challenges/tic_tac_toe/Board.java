package src.challenges.tic_tac_toe;

import java.util.Arrays;

public class Board {

    final int SIZE = 3;
    StringBuilder board;
    Symbols[][] symbols = new Symbols[SIZE][SIZE];

    public Board() {
        for (Symbols[] symbolArr : symbols) {
            Arrays.fill(symbolArr, Symbols.E);
        }
    }

    public Symbols update(int x, int y, Symbols current) throws Exception {

        if (!symbols[x][y].equals(Symbols.E)) {
            throw new Exception("Already placed");
        }

        symbols[x][y] = current;
        return current.next();
    }

    public void show() {
        board = new StringBuilder();
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                board.append(symbols[x][y].getValue());
                if (y < SIZE-1) board.append(" | ");
            }
            board.append("\n");
        }
        System.out.println(board);
    }

    public Symbols checkRow() {
        for (Symbols[] rows : symbols) {
            int X = 0;
            int O = 0;
            for (Symbols symbol : rows) {
                if (symbol.equals(Symbols.X)) X++;
                if (X == SIZE) return Symbols.X;

                if (symbol.equals(Symbols.O)) O++;
                if (O == SIZE) return Symbols.O;
            }
            System.out.println(X + " " + O);
        }
        return null;
    }

    public Symbols checkCol() {
        return null;
    }

    public Symbols checkAngle() {
        return null;
    }

    public Symbols isFull() {
        return null;
    }



}
