package observer_pattern;

public interface Subject {
  public boolean registerObserver(Observer observer);
  public boolean removeObserver(Observer observer);
  public boolean notifyObservers();
}
