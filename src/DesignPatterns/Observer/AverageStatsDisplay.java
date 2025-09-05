package DesignPatterns.Observer;

public class AverageStatsDisplay implements Observer, Display
{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        System.out.println("Average stats display");
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Average stats display: Temperature: "
                + this.temperature + " Humidity: "
                + this.humidity + " Pressure: "
                + this.pressure);
    }
}
