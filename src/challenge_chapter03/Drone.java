package challenge_chapter03;

interface iDrone {
  public void beep();
  public void spinMotor();
  public void takeOff();
}

public class Drone implements iDrone {
  @Override
  public void beep() {
    System.out.println("Beep");
  }

  @Override
  public void spinMotor() {
    System.out.println("Startup");
  }

  @Override
  public void takeOff() {
    System.out.println("Flying");
  }
}