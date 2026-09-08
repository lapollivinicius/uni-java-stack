package src.basic;

public class PrimitiveTypes {

  public static void main(String[] args) {
    
    // primitive types
    byte b = 10;
    short s = 10;
    int i = 10;
    long l = 10L; // L to long

    float f = 10.1f; // f to literal
    double d = 10.1e2; // e notation

    char c = 'a'; // or 97 by ascii table 

    boolean fa = false;
    boolean tr = true;

    // literals
    int bin = 0b11010; // 0b (prefix)
    int hex = 0x1a; // 0x (prefix)
    int oct = 26; // 0 (prefix)
    int dec = 10;

    // separate using underscore
    long doc = 100_10L;

    System.out.println(b);
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
    System.out.println(c);
    System.out.println(fa);
    System.out.println(tr);
    System.out.println(bin);
    System.out.println(hex);
    System.out.println(oct);
    System.out.println(dec);
    System.out.println(doc);



  }

}
