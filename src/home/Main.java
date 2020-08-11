package home;

import home.Movables.Bicycle;


public class Main {

  public static void main(String[] args) {

    Bicycle[] bicycle1 = new Bicycle[]{
        new Bicycle("AIST", 54.5, 4),
        new Bicycle("LTD", 40.0, 3),
        new Bicycle("OXFORD", 45.5, 1)
    };
    Store<Bicycle> bicycleStore = new Store<>(bicycle1);
    bicycleStore.printProducts();

    bicycleStore.purchase(3, 5000);
    bicycleStore.sell(new Bicycle("MAZDA", 50.0, 2), 2000);

  }
}
