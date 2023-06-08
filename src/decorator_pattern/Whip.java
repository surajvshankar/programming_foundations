package decorator_pattern;

public class Whip extends CondimentDecorator{
  final private String description = "whip";
  final private double price = 0.10;
  private Beverage beverage;

  public Whip(Beverage b) {
    this.beverage = b;
  }
  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", " + this.description;

  }

  @Override
  public double getPrice() {
    return this.beverage.getPrice() + this.price;
  }
}
