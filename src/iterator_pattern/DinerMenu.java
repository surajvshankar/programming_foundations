package iterator_pattern;

import java.util.Iterator;
import java.util.ArrayList;

public class DinerMenu extends Menu{
  ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

  public DinerMenu() {
    MenuItem item1 = new MenuItem("BLT", "Healthy", 6, false);
    menuItems.add(item1);
    MenuItem item2 = new MenuItem("Reuben", "Awesome", 8, false);
    menuItems.add(item2);
    MenuItem item3 = new MenuItem("Pastrami", "Giggle", 10, false);
    menuItems.add(item3);
  }

  @Override
  public Iterator<MenuItem> createIterator() {
    return new DinerIterator(menuItems);
  }
}
