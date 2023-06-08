package challenge_chapter04;

import java.util.ArrayList;


public class WeatherStation implements Subject{
  private int temperature;
  private int windSpeed;
  private int pressure;
  private ArrayList<Observer> observers;

  public WeatherStation() {
    observers = new ArrayList<Observer>();
  }

  @Override
  public boolean registerObserver(Observer o) {
    observers.add(o);
    return true;
  }

  @Override
  public boolean removeObserver(Observer o) {
    observers.remove(o);
    return true;
  }

  @Override
  public boolean updateObservers() {
    for (Observer o: observers) {
      o.update(this.temperature, this.windSpeed, this.pressure);
    }
    return true;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    this.updateObservers();
  }
  public void setWindSpeed(int windSpeed) {
    this.windSpeed = windSpeed;
    this.updateObservers();
  }
  public void setPressure(int pressure) {
    this.pressure = pressure;
    this.updateObservers();
  }
}
