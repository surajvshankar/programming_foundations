package factory_pattern;

public class SimplePizzaFactory{
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("pepperoni")){
      pizza = new PepperoniPizza();
    }
    else if (type.equals("cheese")){
      pizza = new PepperoniPizza();
    }
    return pizza;
  }
}
