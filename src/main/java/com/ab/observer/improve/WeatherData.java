package com.ab.observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ab
 * @description 类的核心:
 * 1.包含最新的天气情况
 * 2.含有观察者集合,使用ArrayList管理
 * 3.当数据有更新时,就主动调用ArrayList对象的update(),通知所有的接入方看到的就是最新信息
 * @date
 */
public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    /**
     * 当数据有更新时,setData()
     */
    public void setData(float temperatrue, float humidity, float pressure) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        //将自信消息进行推送,给接收方
        notifyObserver();
    }

    /**
     * 注册哟个观察者
     *
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除一个观察者
     *
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    /**
     * 遍历所有的观察者并通知
     */
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperatrue, this.pressure, this.humidity);
        }
    }
}
