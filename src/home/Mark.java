package home;

public enum Mark {
  MERCEDES("Mercedes", "Germany", 2004),
  BMW("BMW", "Germany", 2001),
  MAZDA("Mazda", "Japan", 2010),
  TESLA("Tesla", "USA", 2020),
  LADA("Lada", "Russia", 2010);

  public String name;
  public String country;
  public int date;

  Mark(String value, String strana, int date) {
    name = value;
    country = strana;
    this.date = date;
  }

}
