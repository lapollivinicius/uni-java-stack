package src.exercises.exercise_65;

import java.util.*;

public class Main {

    /**
     * Receive a map and return a list of entry
     * @param map of String, Integer
     * @return List -> Map.Entry -> String, Integer
     */
    public static List<Map.Entry<String, Integer>> sortMap(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> listMap = new ArrayList<>(map.entrySet());

        listMap.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        return listMap;
    }

    public static void main(String[] args) {

        // Amoeba é bom, amoeba é bom a bessa

        Scanner scan = new Scanner(System.in);
        System.out.print("DIGIT SOMETHING: ");
        String[] phrase = scan.nextLine().split("[\\s,]+");

        Map<String, Integer> elements = new HashMap<>();

        for (String word : phrase) {
            int count = 0;
            for (String word2 : phrase) {
                if (word.equals(word2)) {
                    count++;
                }
            }
            elements.put(word, count);
        }
        System.out.println(sortMap(elements));

    }

}
