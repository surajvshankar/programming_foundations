package iterator_pattern;

public class WaitressTester {
    public static void main(String[] args) {
      PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
      Waitress waitress = new Waitress(panCakeHouseMenu);
      waitress.printMenu();

      DinerMenu dinerMenu = new DinerMenu();
      waitress = new Waitress(dinerMenu);
      waitress.printMenu();
    }
}
