package DesignPatterns.Observer;

public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        weatherData.setParams(35.5f, 44.4f, 90.0f);

        AverageStatsDisplay averageStatsDisplay = new AverageStatsDisplay();
        CurrentStatsDisplay currentStatsDisplay = new CurrentStatsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(averageStatsDisplay);
        weatherData.registerObserver(currentStatsDisplay);
        weatherData.registerObserver(forecastDisplay);

        weatherData.setParams(55.3f, 64.9f, 92.1f);

        weatherData.removeObserver(currentStatsDisplay);
        weatherData.setParams(3.3f, 6.9f, 2.1f);

        currentStatsDisplay.setSubject(weatherData);
        currentStatsDisplay.registerWithSubject();
        weatherData.setParams(59.3f, 68.9f, 99.1f);

    }
}
