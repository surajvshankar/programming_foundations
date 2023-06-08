package factory_method_pattern;

public class ChicagoStypePizza extends PizzaStore{
  @Override
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("pepperoni")){
      pizza = new ChicagoStylePepperoniPizza();
    }
    else if (type.equals("cheese")){
      pizza = new ChicagoStyleCheesePizza();
    }
    return pizza;
  }
}
