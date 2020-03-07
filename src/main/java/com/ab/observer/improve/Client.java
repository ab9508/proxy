package com.ab.observer.improve;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();
        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        Baidu baidu = new Baidu();
        //注册
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baidu);
        //测试
        weatherData.setData(30, 100, 20);


    }
}
