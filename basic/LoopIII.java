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

    // for named
    outer:
    for (int i = 10; i > 0; i--) {

      System.out.println("TIMES " + i);

      inner:
      for (int j = 0; j <= 10; j++) {
        if(j == 3) break outer; // break used the name to break specific for
        System.out.println(i + "x" + j + "=" + (i*j));
      }
    }
  }

}
