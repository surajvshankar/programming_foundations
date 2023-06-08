package adapter_pattern;

public class TurkeyAdapter extends Duck{
  private Turkey turkey;
  TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }
  @Override
  void quack() {
    this.turkey.gobble();
  }
}
