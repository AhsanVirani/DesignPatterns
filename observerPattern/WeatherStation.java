package observerPattern;
import java.util.List;
import java.util.ArrayList;

public class WeatherStation implements Subject{
    private int pressure;
    private int temperature;
    private int humidity;
    private List<Observer> observerList;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    @Override
    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o: this.observerList)
            o.update(pressure, temperature, humidity);
    }
}
