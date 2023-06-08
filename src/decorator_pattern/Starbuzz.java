package decorator_pattern;

public class Starbuzz {
  public static void main(String[] args) {
    Beverage beverage = new DarkRoast();
    beverage = new Mocha(beverage);
    beverage = new Mocha(beverage); // Double Mocha
    beverage = new Whip(beverage);
    System.out.printf("%s: $%.2f\n", beverage.getDescription(), beverage.getPrice());
  }
}
