package src.challenges.psr;

import java.util.Scanner;

public class Game {

    Scanner scan = new Scanner(System.in);

    public void start() {

        int computer, player;
        boolean playerWin;

        while (true) {
            computer = (int) (Math.random() * 2) + 1;
            player = input();

            if (player <= 0 || player > 3) {
                push("digit 1,2 or 3...");
                continue;
            };

            if (player == computer) {
                push("Draw, there is no winner...");
                continue;
            };
            break;
        }

        push(String.format("%s x %s", symbols(player), symbols(computer)));
        playerWin = check(player, computer);

        if (playerWin) {
            push("You win");
        } else {
            push("You lost");
        }

    }

    public int input() {
        System.out.println("1.Paper 2.Scissors 3.Rock");
        System.out.print("choose one -> ");
        return scan.nextInt();
    }

    public void push(String message) {
        System.out.println(message);
    }

    public String symbols(int player) {
        return switch (player) {
            case 1 -> "Paper";
            case 2 -> "Scissors";
            case 3 -> "Rock";
            default -> "";
        };
    }

    public boolean check(int player, int computer) {
        return switch (player) {
            case 1 -> computer == 3;
            case 2 -> computer == 1;
            case 3 -> computer == 2;
            default -> false;
        };
    }

}
