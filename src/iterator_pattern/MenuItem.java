package iterator_pattern;

public class MenuItem {
  private String name;
  private String description;
  private double price;
  private boolean vegetarian;

  MenuItem(String name, String description, double price, boolean vegetarian) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.vegetarian = vegetarian;
  }

  public String getName() {
    return this.name;
  }
}
