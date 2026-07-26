public class Arrays {
  
  public static void main(String[] args) {
    
    // --------------- ARRAY FIXED SIZE

    // type[] namearr = new int[length arr]
    int[] hundreds = new int[3];

    // namearr[index]
    // index -> element position
    hundreds[0] = 100; // to edit
    int item_1 = hundreds[1]; // to get
    int len = hundreds.length; // to know size array

    // create an array literal
    int[] numbers = { 1, 6, 3, 7, 1};

    System.out.println(item_1 + " " + len + " "  + numbers);

  }

}
