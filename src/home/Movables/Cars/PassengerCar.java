package home.Movables.Cars;


import home.Movables.Car;

public class PassengerCar extends Car {

  private boolean back;
  private int capacity;
  private int price = 4000;
  private int fuelSpace;


  PassengerCar(String name, String formattedDate, int number, String colour, boolean moving,
      int capacity,
      boolean back) {
    super(name, formattedDate, number, colour, moving);
    this.capacity = capacity;
    this.back = back;
  }

  class fuel {

    private int fuelReal;
    private int fuelPercent;

    fuel(int fuelSpace, int fuelReal) {
      fuelPercent = (fuelReal / fuelSpace) * 100;
      System.out.println(fuelPercent);
    }

    public int getFuelReal() {
      return fuelReal;
    }

    public void setFuelReal(int fuelReal) {
      this.fuelReal = fuelReal;
    }
  }

  void getInCar() {
    System.out.println("Everyone in the car");
  }

  void getOffCar() {
    System.out.println("Everyone get off car");
  }

  @Override
  protected void toMove() {

    System.out.println("PassengerCar is moving");
  }

  @Override
  protected void toStop() {

    System.out.println("PassengerCar stopped");
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
  public void move() {
    System.out.println("PassengerCar start");
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public boolean isBack() {
    return back;
  }

  public void setBack(boolean back) {
    this.back = back;
  }
}
