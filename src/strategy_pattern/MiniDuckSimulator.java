package strategy_pattern;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    Duck rubber = new RubberDuck();

    mallard.swim();
    mallard.color();
    mallard.performQuack();
    mallard.performFly();

    rubber.swim();
    rubber.color();
    rubber.performQuack();
    rubber.performFly();
  }
}
