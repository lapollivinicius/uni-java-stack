package exercises;

import java.util.Scanner;

public class exercise_17 {

    public static void main(String[] args) {

        // 1l = 6m2
        // 1mb = 3.6l = $25
        // 1b = 18l = $80
        Scanner scan = new Scanner(System.in);

        System.out.print("area (m2): ");
        double area_m2 = scan.nextDouble();

        double liter = area_m2 / 3;
        double literWithMargin = liter + (liter * 0.1);

        double onlyBuckets = Math.ceil(literWithMargin / 18);
        double onlyMiniBuckets = Math.ceil(literWithMargin / 3.6);

        double Buckets = Math.floor(literWithMargin / 18);
        double miniBuckets = Math.ceil((literWithMargin % 18) / 3.6);
        double mix = (Buckets * 80) + (miniBuckets * 25);

        System.out.println("liter: " + literWithMargin);
        System.out.println("only buckets: $" + (onlyBuckets * 80));
        System.out.println("only mini buckets: $" + (onlyMiniBuckets * 25));
        System.out.println("mix of " + Buckets + "B and " + miniBuckets + "MB: $" + mix);
    }

}
