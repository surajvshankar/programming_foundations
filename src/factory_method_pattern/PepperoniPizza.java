package factory_method_pattern;

public class PepperoniPizza extends Pizza {
  @Override
  public String prepare() {
    return "Preparing Pepperoni pizza";
  }
  @Override
  public String bake() {
    return "Baking Pepperoni pizza";
  }
  @Override
  public String box() {
    return "Boxing Pepperoni pizza";
  }
}
