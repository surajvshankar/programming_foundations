package factory_method_pattern;

public class NewYorkStylePepperoniPizza extends PepperoniPizza{
  public String prepare() {
    return super.prepare() + " NY Style";
  }
  public String bake() {
    return super.bake() + " NY Style";
  }
  public String box() {
    return super.box() + " NY Style";
  }
}
