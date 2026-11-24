package src.Advanced.exercises.exercise_80;

import java.util.List;

public class Main {

    static void main() {
        Pair<String, Integer> pair = new Pair<>("Hello", 100);
        pair.showObjs();

        Pair<Pair<String, Integer>, List<Integer>> pair2 = new Pair<>(pair, List.of(1,2,3));
        pair2.showObjs();
    }

}
