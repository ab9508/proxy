package com.ab.facade;

/**
 * @author ab
 * @description
 * @date
 */
public class Stereo {
    private volatile static Stereo instance;

    public static Stereo getInstance() {
        if (instance == null) {
            synchronized (Stereo.class) {
                if (instance == null) {
                    instance = new Stereo();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void down() {
        System.out.println("Stereo down");
    }

    public void up() {
        System.out.println("Stereo up");
    }

}
