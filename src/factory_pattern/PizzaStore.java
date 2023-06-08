package factory_pattern;

public class PizzaStore {
  public void orderPizza(){
    String type = "pepperoni";
    SimplePizzaFactory factory = new SimplePizzaFactory();
    Pizza pizza = factory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  }
}
