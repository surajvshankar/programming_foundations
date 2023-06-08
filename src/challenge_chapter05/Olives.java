package challenge_chapter05;

public class Olives extends Toppings{
  private String topping = "Olives";
  private double price = 0.75;

  public Olives(PizzaBase pizzaBase) {
    this.pizzaBase = pizzaBase;
  }

  @Override
  public String getDescription() {
    return this.pizzaBase.getDescription() + ", " + topping;
  }

  @Override
  public double cost() {
    return this.pizzaBase.cost() + price;
  }

}
