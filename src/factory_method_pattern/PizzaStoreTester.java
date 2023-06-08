package factory_method_pattern;

public class PizzaStoreTester {
  public static void main(String[] args){
    PizzaStore pizzaStore = new ChicagoStypePizza();
    Pizza pizza = pizzaStore.orderPizza("pepperoni");

    pizzaStore = new NewYorkStylePizza();
    pizza = pizzaStore.orderPizza("cheese");
  }
}
