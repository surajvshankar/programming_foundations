package strategy_pattern;

public class RubberDuck extends Duck{
  public RubberDuck() {
    this.quackBehavior = new Squeak();
    this.flyBehavior = new CannotFly();
  }
  @Override
  protected void color() {
    System.out.println("I am yellow!");
  }
}
