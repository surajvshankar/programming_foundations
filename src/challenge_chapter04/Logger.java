package challenge_chapter04;

public class Logger implements Observer{
  private WeatherStation weatherStation;
  private int temperature;
  private int windSpeed;
  private int pressure;
  public Logger(Subject s) {
    s.registerObserver(this);
  }
  @Override
  public boolean update(int temperature, int windSpeed, int pressure) {
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
    return true;
  }

  public void log() {
    System.out.println("The temperature is " + this.temperature);
    System.out.println("The wind speed is " + this.windSpeed);
    System.out.println("The pressure is " + this.pressure);
  }
}
