package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject
{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        System.out.println("Notifying all Observers");
        for (Observer observer : observers)
        {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setParams(float temperature, float humidity, float pressure)
    {
        System.out.println("Weather Patterns have changed.");
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
