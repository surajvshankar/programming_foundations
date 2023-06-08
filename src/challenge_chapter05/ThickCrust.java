package challenge_chapter05;

public class ThickCrust extends PizzaBase{
  final private double price = 5.0;

  public ThickCrust() {
    this.pizzaType = "Thick-Crust-Pizza";
  }

  public double cost() {
    return this.price;
  }
}
