package iterator_pattern;

import java.util.Iterator;

public class Waitress {
//    Menu panCakeHouseMenu;
//
//    public Waitress(Menu panCakeHouseMenu) {
//      this.panCakeHouseMenu = panCakeHouseMenu;
//    }
//    public void printMenu() {
//      Iterator iter = panCakeHouseMenu.createIterator();
//      while(iter.hasNext()) {
//        MenuItem m = (MenuItem) iter.next();
//        System.out.println(m.getName());
//      }
//    }
  Menu menu;

  public Waitress(Menu menu) {
    this.menu = menu;
  }
  public void printMenu() {
    Iterator iter = menu.createIterator();
    while(iter.hasNext()) {
      MenuItem m = (MenuItem) iter.next();
      System.out.println(m.getName());
    }
  }
}
