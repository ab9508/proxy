package com.ab.facade;

/**
 * @author ab
 * @description
 * @date
 */
public class Popcorn {
    private volatile static Popcorn instance;

    public  static Popcorn getInstance() {
        if (instance == null) {
            synchronized (Popcorn.class) {
                if (instance == null) {
                    instance = new Popcorn();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void pop() {
        System.out.println("popcorn pop");
    }

}
