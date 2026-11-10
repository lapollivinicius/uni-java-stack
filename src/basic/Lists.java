package src.basic;

import java.util.ArrayList;
import java.util.List;

public class Lists {
  
  public static void main(String[] args) {
    
    // --------------- LIST

    // list - array with dinamic length
    // List<type> listname = new Arraylist<type>()
    List<String> names = new ArrayList<>();

    // methods
    names.add("john");
    names.add("mary");
    names.add("peter"); // to add item
    String name = names.get(0); // to get an item by index

    names.set(1, "abby"); // Replaces the element by index (index, new value)

    names.remove(0); // remove by index or value

    int listSize = names.size(); // return list size

    boolean arrayEmpty = names.isEmpty(); // return boolean

    names.clear(); // to clear an array
    
    int peter = names.indexOf("peter");
  
    System.out.println(names + name + listSize + arrayEmpty + peter);

  }

}
