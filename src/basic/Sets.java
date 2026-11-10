package src.basic;

import java.util.HashSet;
import java.util.Set;

public class Sets {
  
  public static void main(String[] args) {

    // --------------- SET (NOT DUPLICATE)

    Set<String> usernames = new HashSet<>();

    // methods
    usernames.add("johndoe");
    usernames.add("marydoe");
    usernames.add("peterdoe");

    usernames.contains("abbydoe"); // return boolean if contains the object

    // size, isEmpty, clear

  }
}
