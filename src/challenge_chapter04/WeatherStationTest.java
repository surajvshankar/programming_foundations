package challenge_chapter04;

public class WeatherStationTest {
  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation();
    UserInterface userInterface = new UserInterface(weatherStation);
    Logger logger = new Logger(weatherStation);
    AlertSystem alertSystem = new AlertSystem(weatherStation);

    userInterface.display();
    weatherStation.setTemperature(60);
    logger.log();

    weatherStation.setWindSpeed(110);
    userInterface.display();

    alertSystem.alert();
  }
}
