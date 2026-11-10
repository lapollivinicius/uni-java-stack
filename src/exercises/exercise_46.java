package src.exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exercise_46 {

    static void main() {

        List<Integer> rl = randList(3);
        Iterator<Integer> ite = rl.iterator();
        while(ite.hasNext()) {
            System.out.print(ite.next() + " ");
        }

    }

    static List<Integer> randList(int amount) {
        List<Integer> tempList = new ArrayList<>();
        for(int i = 0; i < amount; i++) {
            int randNumber = (int) Math.ceil( Math.random() * 100);
            tempList.add(randNumber);
        }
        return tempList;
    }

}
