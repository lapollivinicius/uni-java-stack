package OOP;

public class TestCar {

  public static void main(String[] args) {
    
    // Object-Oriented
    Car fordKa = new Car("FORD", "KA");
    fordKa.passengers = 5;
    fordKa.gasConsume = 13;
    fordKa.gasMax = 40;

    System.out.println(fordKa.brand);
    System.out.println(fordKa.model);
    System.out.println(fordKa.passengers);
    System.out.println(fordKa.gasConsume);
    System.out.println(fordKa.gasMax);

    fordKa.setEnginePower(1.6);

    System.out.println("---INFORMATION---");
    fordKa.information();

    double autonomy = fordKa.getAutonomy();
    System.out.println("This car can drive for " + autonomy + "km");

  }

}
