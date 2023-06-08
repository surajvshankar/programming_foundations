package strategy_pattern;

public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Squeaky squeak squeak");
  }
}
