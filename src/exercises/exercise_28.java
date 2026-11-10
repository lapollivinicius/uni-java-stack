package src.Advanced.exercises;

public class exercise_28 {

  public static void main(String[] args) {

    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[5];
    System.arraycopy(a, 0, b, 0, 5);

    for (int number : b ) {
      System.out.println(number);
    }

  }

}
