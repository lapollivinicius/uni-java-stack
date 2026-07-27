package exercises;

import java.util.Scanner;

public class exercise_27 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("number 01: ");
    double a = scan.nextDouble();

    System.out.print("number 02: ");
    double b = scan.nextDouble();

    System.out.print("number 03: ");
    double c = scan.nextDouble();

    if (a >= b && b >= c) {
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
    } else if (a >= c && c >= b) {
      System.out.println(a);
      System.out.println(c);
      System.out.println(b);
    } else if (b >= a && a >= c) {
      System.out.println(b);
      System.out.println(a);
      System.out.println(c);
    } else if (b >= c && c >= a) {
      System.out.println(b);
      System.out.println(c);
      System.out.println(a);
    } else if (c >= a && a >= b) {
      System.out.println(c);
      System.out.println(a);
      System.out.println(b);
    } else {
      System.out.println(c);
      System.out.println(b);
      System.out.println(a);
    }

  }

}
