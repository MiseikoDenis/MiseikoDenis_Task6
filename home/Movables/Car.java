package home.Movables;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class Car implements Movable {

  private String name;
  private String colour;
  private int number;
  private boolean moving;
  private int price;

  DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

  Date date = new Date();
  String formattedDate = dateFormat.format(date);

  Car() {
  }


  protected Car(String name, String formattedDate, int number, String colour, boolean moving) {
    this.name = name;
    this.formattedDate = formattedDate;
    this.number = number;
    this.colour = colour;
    this.moving = moving;

  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    Car car = (Car) obj;
    return name == car.name && Objects.equals(formattedDate, car.formattedDate) && Objects
        .equals(number, car.number) && Objects.equals(colour, car.colour) && Objects
        .equals(moving, car.moving);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name, formattedDate, number, colour, moving);
  }


  @Override
  public String toString() {
    StringBuilder str = new StringBuilder().append(name).append(formattedDate).append(number)
        .append(colour).append(moving);
    return "Car{" +
        "str=" + str +
        '}';
  }


  protected abstract void toMove();

  protected abstract void toStop();

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public String getFormattedDate() {
    return formattedDate;
  }

  public void setFormattedDate(String formattedDate) {
    this.formattedDate = formattedDate;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public boolean isMoving() {
    return moving;
  }

  public void setMoving(boolean moving) {
    this.moving = moving;
  }
}
