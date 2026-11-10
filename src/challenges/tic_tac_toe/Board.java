package src.challenges.tic_tac_toe;

import java.util.Arrays;

public class Board {

    final int SIZE = 4;
    StringBuilder stringBoard;
    Symbols[][] board = new Symbols[SIZE][SIZE];

    public Board() {
        for (Symbols[] symbolArr : board) {
            Arrays.fill(symbolArr, Symbols.NONE);
        }
    }

    public Symbols update(int x, int y, Symbols current) throws Exception {

        if (!board[x][y].equals(Symbols.NONE)) {
            throw new Exception("Already placed");
        }

        board[x][y] = current;
        return current.next();
    }

    public void show() {
        stringBoard = new StringBuilder();
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                stringBoard.append(board[row][col].getValue());
                if (col < SIZE-1) stringBoard.append(" | ");
            }
            stringBoard.append("\n");
        }
        System.out.println(stringBoard);
    }

    public Symbols checkRows() {
        for (int row = 0; row < SIZE; row++) {
            if (board[row][0].equals(Symbols.NONE)) continue;
            boolean winner = true;
            for (int col = 0; col < SIZE; col++) {
                if (!board[row][0].equals(board[row][col])) {
                    winner = false;
                    break;
                }
            }
            if (winner) return board[row][0];
        }
        return null;
    }

    public Symbols checkCols() {
        for (int col = 0; col < SIZE; col++) {
            if (board[0][col].equals(Symbols.NONE)) continue;
            boolean winner = true;
            for (int row = 0; row < SIZE; row++) {
                if (!board[0][col].equals(board[row][col])) {
                    winner = false;
                    break;
                }
            }
            if (winner) return board[0][col];
        }
        return null;
    }

    public Symbols checkAngles() {

        boolean winner = true;
        Symbols first = board[0][0];

        if (!first.equals(Symbols.NONE)) {
            for (int i = 0; i < SIZE; i++) {
                if (!board[i][i].equals(first)) {
                    winner = false;
                    break;
                }
            }
            if (winner) return first;
        }

        first = board[0][SIZE-1];

        if (!first.equals(Symbols.NONE)) {
            winner = true;
            for (int i = 0; i < SIZE; i++) {
                if (!board[i][SIZE - 1 - i].equals(first)) {
                    winner = false;
                    break;
                }
            }
            if (winner) return first;
        }
        return null;
    }

    public boolean isFull() {
        for (Symbols[] rows : board) {
            for (Symbols symbol : rows) {
                if (symbol.equals(Symbols.NONE)) {
                    return false;
                }
            }
        }
        return true;
    }
}
