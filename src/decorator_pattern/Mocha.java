package decorator_pattern;

public class Mocha extends CondimentDecorator{
  final private String description = "mocha";
  final private double price = 1.00;
  private Beverage beverage;

  public Mocha(Beverage b) {
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
