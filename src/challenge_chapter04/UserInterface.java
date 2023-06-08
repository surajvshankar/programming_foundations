package challenge_chapter04;

public class UserInterface implements Observer{
  private int temperature;
  private int windSpeed;
  private int pressure;
//  private Subject subject;

  public UserInterface(Subject s) {
//    this.subject = s;
    s.registerObserver(this);
  }
  @Override
  public boolean update(int temperature, int windSpeed, int pressure) {
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
    return true;
  }

  public void display() {
    System.out.println("The temperature is: " + this.temperature);
    System.out.println("The wind speed is: " + this.windSpeed);
    System.out.println("The pressure is: " + this.pressure);
  }
}
