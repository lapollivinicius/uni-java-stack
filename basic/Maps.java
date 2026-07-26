import java.util.HashMap;
import java.util.Map;

public class Maps {
  public static void main(String[] args) {

    // --------------- MAP (KEY, VALUE)

    Map<String, Double> heights = new HashMap<>();

    // to ad
    heights.put("anne", 5.2);
    heights.put("mathew", 5.9); // to add (k, v)

    heights.getOrDefault(heights, null); 

    heights.containsKey("anne"); // return boolean

    heights.containsValue(5.6); // return boolean

    heights.replace("anne", 5.3);

    // get, remove, size, isEmpty, clear

  }
}
