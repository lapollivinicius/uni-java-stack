package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("genre: ");
        String genre = scan.next();

        switch (genre) {
            case "m":
                System.out.println("MASC");
                break;
            case "f":
                System.out.println("FEM");
                break;
            default:
                System.out.println("invalid genre");
                break;
        }

    }

}
