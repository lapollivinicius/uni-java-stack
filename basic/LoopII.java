public class LoopII {

  public static void main(String[] args) {

    // var with index ; condition ; increment
    // white condition was true, increment and block is run
    for (int i = 10; i > 0; i--) {
      System.out.println(i);
    }

    // nested 
    for (int i = 10; i > 0; i--) {
      System.out.println("TIMES " + i);
      for (int j = 0; j <= 10; j++) {
        System.out.println(i + "x" + j + "=" + (i*j));
      }
    }

    // recursion 
    // ...


  }
}
