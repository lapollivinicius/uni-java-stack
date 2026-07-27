package exercises;

public class exercise_25 {

  public static int MIN(int[] arr) {
    int currentNumber = arr[0];
    for (int number : arr) {
      if (number < currentNumber) {
        currentNumber = number;
      }
    }
    return currentNumber;
  }

  public static void main(String[] args) {
    int[] arr = {100, 20, 30};
    int minNumber = MIN(arr);
    System.out.println(minNumber);
  }

}
