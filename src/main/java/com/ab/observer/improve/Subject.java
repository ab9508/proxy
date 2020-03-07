package com.ab.observer.improve;



/**
 * @author ab
 * @description 接口,让WeatherData来实现
 * @date
 */
public interface Subject {
    public void registerObserver(Observer o);
    public  void removeObserver(Observer o);
    public void notifyObserver();

}
