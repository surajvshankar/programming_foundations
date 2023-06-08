package iterator_pattern;

import java.util.Iterator;

public class PanCakeHouseMenu extends Menu{
  final private int TotalTypesOfPancakes = 4;
  MenuItem[] menuItems = new MenuItem[TotalTypesOfPancakes];
  public PanCakeHouseMenu() {
    for(int i=1; i<=TotalTypesOfPancakes; i++) {
      MenuItem item = new MenuItem("pancake" + i, "Pancake Type " + i, 10, false);
      menuItems[i-1] = item;
    }
  }
  public Iterator<MenuItem> createIterator() {
    return new PanCakeHouseIterator(menuItems);
  }
}
