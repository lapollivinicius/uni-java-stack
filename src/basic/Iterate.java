package src.basic;

import java.util.HashMap;
import java.util.Map;

public class Iterate {
  
  public static void main(String[] args) {
    
    // string array
    String[] mouths = {
      "Jan", "Feb", "Mar", "Apr",
      "May", "Jun", "Jul", "Aug",
      "Sep", "Oct", "Nov", "Dec"
    };

    // to iterate an array we can use loops
    // .length - a method that returns how much items have in an array
    for(int index = 0; index < mouths.length; index++) {
      System.out.println("Mouth " + index + ": " + mouths[index]);
    }

    // for to arr
    //  (item iterated : array)
    for (String mouth : mouths) {
      System.out.println("Mouth: " + mouth);
    }

    // map with key
    Map<String, Double> heights = new HashMap<>();

    // key
    for (String name : heights.keySet()) {
      System.out.println(name);
    }
    // value
    for (Double height : heights.values()) {
        System.out.println(height);
    }
    // key and value
    for (Map.Entry<String, Double> entry : heights.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }

  }

}
