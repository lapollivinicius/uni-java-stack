package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_16 {

    public static void main(String[] args) {

        // 1l = 3m2
        // 1b = 18l
        // 1b = $80
        Scanner scan = new Scanner(System.in);

        System.out.print("area (m2): ");
        double area_m2 = scan.nextDouble();

        double liter = area_m2 / 3;

        double buckets = Math.ceil(liter / 18);

        System.out.println(buckets + " buckets");
        System.out.println("$" + (buckets * 80));

    }

}
