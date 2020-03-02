package com.ab.facade;

/**
 * @author ab
 * @description
 * @date
 */
public class TheaterLight {
    private volatile static TheaterLight instance;

    public static TheaterLight getInstance() {
        if (instance == null) {
            synchronized (TheaterLight.class) {
                if (instance == null) {
                    instance = new TheaterLight();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("TheaterLight on");
    }

    public void off() {
        System.out.println("TheaterLight off");
    }

    public void down() {
        System.out.println("TheaterLight down");
    }

    public void up() {
        System.out.println("TheaterLight up");
    }

    public void dim() {
        System.out.println("TheaterLight dim");
    }


}
