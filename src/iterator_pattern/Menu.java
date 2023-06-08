package iterator_pattern;

import java.util.Iterator;

public abstract class Menu {
  public abstract Iterator<MenuItem> createIterator();
}
