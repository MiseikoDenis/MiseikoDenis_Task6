package home.Movables;

public class Bicycle implements Movable {

  private String name;
  double dWeels;
  int lights;
  static int price = 3000;

  public Bicycle() {

  }


  public Bicycle(String name, double dWeels, int lights) {
    this.name = name;
    this.dWeels = dWeels;
    this.lights = lights;
  }

  class chair {

    private int iznos;

    chair(int iznos) {
      this.iznos = iznos;
      System.out.println(iznos);
    }

    public int getIznos() {
      return iznos;
    }

    public void setIznos(int iznos) {
      this.iznos = iznos;
    }
  }

  @Override
  public String toString() {
    return
        "name='" + name + '\'' +
            ", dWeels=" + dWeels +
            ", lights=" + lights +
            ", price=" + price;
  }

  @Override
  public void move() {
    System.out.println("Bicycle is moving");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getdWeels() {
    return dWeels;
  }

  public void setdWeels(double dWeels) {
    this.dWeels = dWeels;
  }

  public int getLights() {
    return lights;
  }

  public void setLights(int lights) {
    this.lights = lights;
  }

  public static int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}

