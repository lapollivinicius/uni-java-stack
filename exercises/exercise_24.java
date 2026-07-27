package exercises;

public class exercise_24 {

    public static int MAX(int[] arr) {
        int currentNumber = arr[0];
        for (int number : arr) {
            if (currentNumber < number) {
                currentNumber = number;
            }
        }
        return currentNumber;
    }

    public static void main(String[] args) {
        int[] arr = {100, 20, 30};
        int maxNumber = MAX(arr);
        System.out.println(maxNumber);
    }

}
