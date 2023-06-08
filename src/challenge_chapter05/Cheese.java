package challenge_chapter05;

public class Cheese extends Toppings{

  private String topping = "Cheese";
  private double price = 1.0;

  public Cheese(PizzaBase pizzaBase) {
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
