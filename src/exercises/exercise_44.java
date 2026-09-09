package src.exercises;

import java.util.Arrays;

public class exercise_44 {

    static void main() {

        double[] numbers = pow2(2,5,10);
        System.out.println(Arrays.toString(numbers));

    }

    public static double[] pow2(double... numbers) {
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

}
