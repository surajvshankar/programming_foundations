package observer_pattern;

public class SimpleObserver implements Observer {
  private int value;
  private Subject simpleSubject;

  public SimpleObserver(Subject simpleSubject) {
    this.simpleSubject = simpleSubject;
    this.simpleSubject.registerObserver(this);
  }
  @Override
  public boolean update(int value) {
    this.value = value;
    return true;
  }

  public void display() {
    System.out.println("value in SimpleObserve: " + this.value);
  }
}
