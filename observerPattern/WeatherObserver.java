package observerPattern;

public class WeatherObserver implements Observer{
    
    private int pressure;
    private int temperature;
    private int humidity;
    private Subject subject; // Heart of observer pattern. An instance of subject

    public WeatherObserver(Subject subject) {
        this.subject = subject; // instantiate with subject we observe
        this.subject.addObserver(this); // add our observer to subject 
    }

    @Override
    public void update(int pressure, int temperature, int humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;

        showData();
    }

    private void showData() {
        System.out.println("Pressure: " + pressure + " Temperature: " + temperature + " Humidity: " + humidity);
    }

}
