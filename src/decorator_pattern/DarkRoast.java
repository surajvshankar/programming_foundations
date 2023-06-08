package decorator_pattern;

public class DarkRoast extends Beverage{

  public DarkRoast() {
    description = "Coffee";
  }
  @Override
  public double getPrice() {
    return 0.99;
  }
}
