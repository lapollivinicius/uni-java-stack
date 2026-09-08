package src.basic;

public class LoopI {
  
  public static void main(String[] args) {

    // ---- WHILE

    int init_1 = 0, count_1 = 10;

    System.out.println("Count 1: ");

    // while this is true continue running
    while(init_1 <= count_1) {
      System.out.println(init_1);
      init_1++;
    }

    // ---- DO WHILE

    int init_2 = 0, count_2 = 10;

    System.out.println("Count 2: ");

    // do this and while is true running
    do {
      System.out.println(count_2);
      count_2--;
    } while (count_2 >= init_2);

  }

}
