package factory_method_pattern;

public class ChicagoStyleCheesePizza extends CheesePizza{
  public String prepare() {
    return super.prepare() + " Chicago Style";
  }
  public String bake() {
    return super.bake() + " Chicago Style";
  }
  public String box() {
    return super.box() + " Chicago Style";
  }
}
