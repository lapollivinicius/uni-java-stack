package exercises;

public class exercise_30 {

  public static void main(String[] args) {

    int[] a = new int[10];
    int[] b = new int[10];
    int count = 0;

    for (int i = 0; i < a.length; i++) {
      a[i] = (int) Math.ceil(Math.random() * 10);

      if (a[i] % 2 == 0) {
        count += 1;
      }

      System.out.print(a[i]);
    }

    System.out.println("\neven numbers = " + count);

  }

}
