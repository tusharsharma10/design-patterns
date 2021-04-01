package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{


    private int temperature;
    private int pressure;
    private int humidity;

    private List<Observer> observerList;

    public WeatherStation(){

        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        
        this.observerList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        
        for(Observer o : observerList){

            o.update(pressure, temperature, humidity);
        }

    }

    
    

    /**
     * @return int return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    /**
     * @return int return the pressure
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * @param pressure the pressure to set
     */
    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    /**
     * @return int return the humidity
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    /**
     * @return List<Observer> return the observerList
     */
    public List<Observer> getObserverList() {
        return observerList;
    }

    /**
     * @param observerList the observerList to set
     */
    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

}
