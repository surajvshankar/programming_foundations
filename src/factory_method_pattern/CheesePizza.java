package factory_method_pattern;

public class CheesePizza extends Pizza {
  @Override
  public String prepare() {
    return "Preparing Cheese pizza";
  }
  @Override
  public String bake() {
    return "Baking Cheese pizza";
  }
  @Override
  public String box() {
    return "Boxing Cheese pizza";
  }
}
