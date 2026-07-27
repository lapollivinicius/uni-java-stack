package exercises;

import java.util.Scanner;

public class exercise_20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("a real number: ");
        int number = scan.nextInt();

        String msg = number >= 0 ? "positive" : "negative";

        System.out.println(msg);

    }
}
