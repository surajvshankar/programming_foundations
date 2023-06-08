package iterator_pattern;

import java.util.Iterator;

public class PanCakeHouseIterator implements Iterator<MenuItem> {
  MenuItem[] menuItems;

  PanCakeHouseIterator(MenuItem[] m) {
    menuItems = m;
  }
  private int pos = 0;

  public boolean hasNext() {
    if (menuItems.length > pos) {
       return true;
    }
    else {
      return false;
    }
  }
  public MenuItem next(){
    MenuItem item = menuItems[pos];
    pos++;
    return item;
  }
}
