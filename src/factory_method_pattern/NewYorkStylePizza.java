package factory_method_pattern;

public class NewYorkStylePizza extends PizzaStore{
  @Override
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("pepperoni")){
      pizza = new NewYorkStylePepperoniPizza();
    }
    else if (type.equals("cheese")){
      pizza = new NewYorkStyleCheesePizza();
    }
    return pizza;
  }
}
