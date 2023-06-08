package challenge_chapter05;

public abstract class PizzaBase {
  protected String pizzaType = "Unknown Type";

  public String getDescription() {
    return pizzaType;
  }
  public abstract double cost();
}
