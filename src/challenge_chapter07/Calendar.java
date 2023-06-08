package challenge_chapter07;

public abstract class Calendar {
  protected Zone zone;

  public void print() {
    System.out.println(zone.getDisplayName());
  }

  abstract public void createCalendar();
}
