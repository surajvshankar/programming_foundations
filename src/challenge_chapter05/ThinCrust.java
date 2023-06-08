package challenge_chapter05;

public class ThinCrust extends PizzaBase{
  final private double price = 4.0;

  public ThinCrust() {
    this.pizzaType = "Thin-Crust-Pizza";
  }

  public double cost() {
    return this.price;
  }
}
