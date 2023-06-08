package challenge_chapter07;

public class PacificCalendar extends Calendar{
  PacificCalendar() {
    ZoneFactory zf = new ZoneFactory();
    this.zone = zf.createZone("pst");
  }
  public void createCalendar() {
    System.out.println(this.zone.getOffset());
  }
}
