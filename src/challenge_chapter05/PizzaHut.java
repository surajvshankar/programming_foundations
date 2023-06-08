package challenge_chapter05;

public class PizzaHut {
  public static void main(String[] args) {
    PizzaBase pizza = new ThinCrust();
    pizza = new Cheese(pizza);
    System.out.printf("%s: %.2f\n", pizza.getDescription(), pizza.cost());

    pizza = new ThickCrust();
    pizza = new Olives(pizza);
    pizza = new Peppers(pizza);
    System.out.printf("%s: %.2f\n", pizza.getDescription(), pizza.cost());
  }
}
