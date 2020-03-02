package com.ab.facade;

/**
 * @author ab
 * @description
 * @date
 */
public class Screen {
    private volatile static Screen instance;

    public static Screen getInstance() {
        if (instance == null) {
            synchronized (Screen.class) {
                if (instance == null) {
                    instance = new Screen();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("Screen on");
    }

    public void off() {
        System.out.println("Screen off");
    }

    public void down() {
        System.out.println("Screen down");
    }

    public void up() {
        System.out.println("Screen up");

    }
}
