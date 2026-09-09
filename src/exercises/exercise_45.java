package src.exercises;

import java.util.Arrays;

public class exercise_45 {

    static void main() {

        int[] n = bubbleSort(5,7,3,1,9,2);
        System.out.println(Arrays.toString(n));

    }

    public static int[] bubbleSort(int... numbers) {
        for(int i = 0; i < (numbers.length - 1); i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    int current = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = current;
                }
            }
        }
        return numbers;
    }

}
