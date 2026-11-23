package src.advanced.stream;

import java.util.Arrays;
import java.util.Random;

public class StreamRandom {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = random
                .ints(0, 10)
                .limit(5)
                .toArray();

        System.out.println(Arrays.toString(array));

    }

}
