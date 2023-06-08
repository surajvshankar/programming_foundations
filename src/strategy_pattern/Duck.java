package strategy_pattern;

public abstract class Duck {
  protected QuackBehavior quackBehavior;
  protected FlyBehavior flyBehavior;
  abstract protected void color();
  final void performFly() {
    flyBehavior.fly();
  }
  final void performQuack() {
    quackBehavior.quack();
  }
  final void swim() {
    System.out.println("They all can swim!");
  }
}
