package DesignPatterns.Observer;

public class ForecastDisplay implements Observer, Display
{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Forecast Display");
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Heavy rain is forecasted tonight");
    }
}
