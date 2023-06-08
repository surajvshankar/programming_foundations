package observer_pattern;

import java.util.ArrayList;


public class SimpleSubject implements Subject {
  private ArrayList<Observer> observers;
  int value = 0;

  public SimpleSubject() {
    this.observers = new ArrayList<Observer>();
  }

  @Override
  public boolean registerObserver(Observer observer) {
    observers.add(observer);
    return true;
  }

  @Override
  public boolean removeObserver(Observer observer) {
    observers.remove(observer);
    return true;
  }

  @Override
  public boolean notifyObservers() {
    for (Observer observer: observers) {
      observer.update(value);
    }
    return true;
  }

  public void setValue(int value) {
    this.value = value;
    notifyObservers();
  }
}
