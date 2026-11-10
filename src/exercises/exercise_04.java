package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("note 1: ");
        int n1 = scan.nextInt();

        System.out.print("note 2: ");
        int n2 = scan.nextInt();

        System.out.print("note 3: ");
        int n3 = scan.nextInt();

        System.out.print("note 4: ");
        int n4 = scan.nextInt();

        double average = (double) (n1 + n2 + n3 + n4) / 4;

        System.out.println("The average is " + average);


    }

}
