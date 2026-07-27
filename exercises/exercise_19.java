package exercises;

import java.util.Scanner;

public class exercise_19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("a number: ");
        int n1 = scan.nextInt();

        System.out.print("other number: ");
        int n2 = scan.nextInt();

        int max = Math.max(n1, n2);

        System.out.println(max);

    }

}
