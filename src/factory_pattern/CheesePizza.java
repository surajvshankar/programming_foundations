package factory_pattern;

public class CheesePizza extends Pizza{
  @Override
  public void prepare() {
    System.out.println("Preparing Cheese pizza");
  }
  @Override
  public void bake() {
    System.out.println("Baking Cheese pizza");
  }
  @Override
  public void cut() {
    System.out.println("Cutting Cheese pizza");
  }
  @Override
  public void box() {
    System.out.println("Boxing Cheese pizza");
  }
}
