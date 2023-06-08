package challenge_chapter05;

public class Peppers extends Toppings{
  private String topping = "Peppers";
  private double price = 0.50;

  public Peppers(PizzaBase pizzaBase) {
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
