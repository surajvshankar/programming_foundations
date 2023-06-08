package challenge_chapter03;

public class DroneAdapter extends Duck{
  protected Drone drone;
  DroneAdapter(Drone drone) {
    this.drone = drone;
  }
  @Override
  void quack() {
    this.drone.beep();
  }
  @Override
  void fly() {
    this.drone.spinMotor();
    this.drone.takeOff();
  }
}
