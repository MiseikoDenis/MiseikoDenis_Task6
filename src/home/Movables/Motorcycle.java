package home.Movables;

public class Motorcycle implements Movable {

  String colour;
  int maxSpeed;
  int price = 3500;

  Motorcycle(int maxSpeed, String colour) {
    this.maxSpeed = maxSpeed;
    this.colour = colour;
  }

  class Panel {

    private String type;

    Panel(String type) {
      this.type = type;
    }

    public void panelType() {
      System.out.println(type.toString());
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }
  }

  @Override
  public void move() {
    System.out.println("Motorcycle is moving");
  }
}
