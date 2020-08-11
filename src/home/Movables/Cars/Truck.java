package home.Movables.Cars;


import home.Movables.Car;

public class Truck extends Car {

  private int weight;
  private int price = 7000;


  Truck(String name, String formattedDate, int number, String colour, boolean moving, int weight) {
    super(name, formattedDate, number, colour, moving);
    this.weight = weight;

  }

  class Wheel {

    private double radius;
    private int weightWheel;
    private String typeWheel;

    Wheel(double radius, int weightWheel, String typeWheel) {
    }
  }

  public void getOffBack() {
    System.out.println("Back is dropped");
  }

  public void getOnBack() {
    System.out.println("Got back on board");
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public int getPrice() {
    return price;
  }

  @Override
  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public void toMove() {
    System.out.println("Truck is moving");
  }

  @Override
  public void toStop() {
    System.out.println("Truck stopped");
  }

  @Override
  public void move() {
    System.out.println("Truck start");
  }
}
