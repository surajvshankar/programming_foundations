package factory_method_pattern;

public abstract class PizzaStore {
  protected Pizza pizza;
  abstract public Pizza createPizza(String type);

  public Pizza orderPizza(String type) {
    // Choose Pizza Type
    pizza = createPizza(type);

    // Create it
    System.out.println(pizza.prepare());
    System.out.println(pizza.bake());
    System.out.println(pizza.cut());
    System.out.println(pizza.box());

    return pizza;
  }
}
