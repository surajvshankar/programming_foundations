package adapter_pattern;

public class DuckSimulator {
  public static void main(String[] args) {
    Duck duck = new TurkeyAdapter(new Turkey());
    duck.fly();
    duck.quack();
  }
}
