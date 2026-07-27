package exercises;

import java.util.Scanner;

public class exercise_26 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("product 01: ");
    double price_01 = scan.nextDouble();

    System.out.print("product 02: ");
    double price_02 = scan.nextDouble();

    System.out.print("product 03: ");
    double price_03 = scan.nextDouble();

    if(price_01 > price_02 & price_01 > price_03) {
      System.out.println(price_01);
    } else if(price_02 > price_03) {
      System.out.println(price_02);
    } else {
      System.out.println(price_03);
    }

  }

}
