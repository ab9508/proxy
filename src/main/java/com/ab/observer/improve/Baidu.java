package com.ab.observer.improve;

/**
 * @author ab
 * @description
 * @date
 */
public class Baidu implements Observer {
    /**
     * 温度,气压,湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;

    /**
     * 更新天气,是由WeatherData来调用,我使用推送者模式
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }

    /**
     * 显示
     */
    public void display() {
        System.out.println(this.getClass().getName());
        System.out.println("temperature:" + temperature);
        System.out.println("pressure:" + pressure);
        System.out.println("humidity:" + humidity);
    }

}
