package src.advanced;

import java.util.Random;
import java.util.UUID;

public class Aleatory {

    public static void main(String[] args) {

        // using math (0 to 0.9)
        int r = (int) Math.ceil(Math.random() * 10);
        System.out.println(r);

        // using class random
        // it can have a seed (to define a fixed sequence)
        Random rand = new Random(1);
        // random number origin bound
        System.out.println(rand.nextInt(0, 10));

        // UUID
        UUID id = UUID.randomUUID();
        System.out.println(id);

    }

}
