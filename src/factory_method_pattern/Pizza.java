package factory_method_pattern;

public abstract class Pizza {
  abstract public String prepare();
  abstract public String bake();
  public String cut() {
    return "Cutting the pizza";
  }
  abstract public String box();
}
