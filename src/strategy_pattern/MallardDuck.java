package strategy_pattern;

public class MallardDuck extends Duck {
  public MallardDuck() {
    this.quackBehavior = new Quack();
    this.flyBehavior = new CanFly();
  }
  public void color() {
    System.out.println("I am Green");
  }
}
