public class LoopIII {
  
  public static void main(String[] args) {
    
    // continue skip the step loop to next one
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println("INDEX: " + i);
    }

    System.out.println("--------" );

    // break breaks the loop
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println("INDEX: " + i);
    }
  }

}
