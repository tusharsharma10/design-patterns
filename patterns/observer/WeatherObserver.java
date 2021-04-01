package patterns.observer;

public class WeatherObserver implements Observer {

    private int pressure;
    private int temperature;
    private int humidity;

    // composition - has-A relationship
    private Subject subject;

    public WeatherObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    /**
     * this method is called by the subject to update the observer.
     */
    @Override
    public void update(int pressure, int temperature, int humidity) {
        
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;

        showData();
    }

    private void showData(){

        System.out.println("Pressure:"+pressure+" Temperature:"+temperature+" humidity:"+humidity);
    }

    
}
