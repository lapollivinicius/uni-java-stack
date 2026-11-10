package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("letter: ");
        String letter = scan.next();

        switch (letter) {
            case "a", "e", "i", "o", "u":
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }

    }
}
