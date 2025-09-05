package DesignPatterns.Observer;

public class CurrentStatsDisplay implements Observer, Display
{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        System.out.println("Current stats display");
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current stats display: Temperature: " + this.temperature);
        System.out.println("Current stats display: Humidity: " + this.humidity);
        System.out.println("Current stats display: Pressure: " + this.pressure);
    }
}
