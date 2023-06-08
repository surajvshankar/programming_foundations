package observer_pattern;

public class Begin {
  public static void main(String[] args){
    SimpleSubject simpleSubject = new SimpleSubject();
    SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
    simpleObserver.display();
    simpleSubject.setValue(25);
    simpleObserver.display();
  }
}
