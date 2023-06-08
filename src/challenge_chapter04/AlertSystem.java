package challenge_chapter04;

public class AlertSystem implements Observer{
  private int temperature;
  private int windSpeed;
  private int pressure;

  public AlertSystem(Subject s) {
    s.registerObserver(this);
  }
  @Override
  public boolean update(int temperature, int windSpeed, int pressure) {
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
    return true;
  }

  public void alert() {
    final int threshold = 100;
    if (this.temperature >= threshold) {
      System.out.println("The temperature is greater than " + threshold);
    }
    else if (this.windSpeed >= threshold) {
      System.out.println("The wind speed is greater than " + threshold);
    }
    else if (this.pressure >= threshold) {
      System.out.println("The pressure is greater than " + threshold);
    }
  }
}
