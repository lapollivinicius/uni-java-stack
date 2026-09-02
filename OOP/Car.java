package OOP;

public class Car {

  // atributes to object car
  String brand;
  String model;
  private String wheels;
  int passengers;
  double gasMax;
  double gasConsume;
  double enginePower;

  // constructor
  Car(String brand, String model, String wheels) {
    this.brand = brand;
    this.model = model;
    this.wheels = wheels;
  }

  // we can ref other constructor 
  Car(String brand, String model) {
    this(brand, model, "R10/165");
  }

  // methods
  // type-return nameMethod { logic... }
  void information() {

    System.out.println("This a " + this.model);
    System.out.println("from Brand " + this.brand);
    System.out.println("engine power " + this.enginePower + "v");
    System.out.println("able to " + this.passengers + " passagers");
    System.out.println("and can drive " + this.gasConsume + "KM/L");
    System.out.println("Wheels model " + this.wheels);

  }

  // method with return
  double getAutonomy() {
    return this.gasMax * this.gasConsume;
  }

  // method with parameters
  void setEnginePower(double vp) {
    this.enginePower = vp;
  }

}
