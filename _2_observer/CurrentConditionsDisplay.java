package _2_observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    // private Subject weatherData;
    public CurrentConditionsDisplay(Subject weatherData) {
        // this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println(
            "現在の気象状況：" +
            "温度" + temperature + "度 " +
            "湿度" + humidity + "%" +
            "気圧" + pressure + "hPa"
        );
    }
}
