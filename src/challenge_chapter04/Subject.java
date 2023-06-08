package challenge_chapter04;

public interface Subject {
  public boolean registerObserver(Observer o);
  public boolean removeObserver(Observer o);
  public boolean updateObservers();
}
