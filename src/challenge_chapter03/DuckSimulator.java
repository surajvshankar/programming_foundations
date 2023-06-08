package challenge_chapter03;

public class DuckSimulator {
  public static void main(String[] args) {
    Duck duck = new DroneAdapter(new Drone());
    duck.quack();
    duck.fly();
  }
}
