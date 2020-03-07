package com.ab.observer.improve;

/**
 * @author ab
 * @description 观察者接口, 由观察者实现
 * @date
 */
public interface Observer {
    public void update(float temperature, float pressure, float humidity);

}
