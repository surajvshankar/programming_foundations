package iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;


public class DinerIterator implements Iterator<MenuItem> {
  private ArrayList<MenuItem> menuItems;
  private int pos = 0;

  DinerIterator(ArrayList<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    if (pos < menuItems.size()) {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public MenuItem next() {
    MenuItem item = menuItems.get(pos);
    pos++;
    return item;
  }
}
