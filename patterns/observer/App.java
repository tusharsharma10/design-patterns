package patterns.observer;

public class App {
    
    public static void main(String[] args) {
     
            WeatherStation  station = new WeatherStation();
            WeatherObserver observer = new WeatherObserver(station);

            station.setHumidity(32);
            station.setTemperature(40);
            station.setPressure(30);
    }
}
