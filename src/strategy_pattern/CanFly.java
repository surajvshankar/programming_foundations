package strategy_pattern;

public class CanFly implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("Can fly!");
  }
}
