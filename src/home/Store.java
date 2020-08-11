package home;

import home.Movables.Bicycle;
import home.Movables.Movable;
import java.util.Arrays;

public class Store<T extends Movable> {

  private T[] item;
  private int cash = 10000;

  public Store(T[] item) {
    this.item = item;
  }


  public void printProducts() {
    for (int i = 0; i < item.length; i++) {
      System.out.println(i + 1 + ". " + item[i]);
    }
  }

  public void purchase(int i, int money) {
    if (money >= Bicycle.getPrice()) {
      cash = cash + money;
      System.out.println("We buy " + Arrays.toString(new Movable[]{item[i - 1]}));
      item[i - 1] = null;
      for (int j = i + 1; j < item.length - 1; j++) {
        item[j - 1] = item[j];
        item[j] = null;
      }
    } else {
      System.out.println("Not enough money!!!!");
    }
  }

  public void sell(T tradeIn, int moneyWant) {

    if (moneyWant < Bicycle.getPrice() && cash >= moneyWant) {
      cash = cash - moneyWant;
      T[] newitem = Arrays.copyOf(getItem(), item.length + 1);
      item[item.length - 1] = tradeIn;
      System.out.println("We sold " + Arrays.toString(new Movable[]{item[item.length - 1]}));
    } else {
      System.out.println("Error!!!!!");
    }
  }

  @Override
  public String toString() {
    return "Store{" +
        "item=" + Arrays.toString(item) +
        ", cash=" + cash +
        '}';
  }

  public T[] getItem() {
    return item;
  }

  public void setItem(T[] item) {
    this.item = item;
  }
}
