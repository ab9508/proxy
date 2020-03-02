package com.ab.facade;

/**
 * @author ab
 * @description
 * @date
 */
public class Projector {
    private volatile static Projector instance;

    public static Projector getInstance() {
        if (instance == null) {
            synchronized (Projector.class) {
                if (instance == null) {
                    instance = new Projector();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void focus() {
        System.out.println("Projector is projector");
    }


}
