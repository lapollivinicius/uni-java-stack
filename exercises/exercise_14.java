package exercises;

import java.util.Scanner;

public class exercise_14 {
    public static void main(String[] args) {

        // fish 50kg
        // $4 per kg exceeded

        Scanner scan = new Scanner(System.in);

        System.out.print("Fishing Weight: ");
        double fishingWeight = scan.nextDouble();
        double tax;

        if(fishingWeight > 50) {
            tax = (fishingWeight - 50) * 4;
            System.out.println("you need to pay $" + tax);
        } else {
            tax = 0;
            System.out.println("nice, your tax is $" + tax);
        }


    }
}
