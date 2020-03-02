package com.ab.facade;

/**
 * @author ab
 * @description
 * @date
 */
public class DVDPlayer {

    /**
     * 单例模式，饿汉式
     */
    private static DVDPlayer instence = new DVDPlayer();

    public static  DVDPlayer getInstence() {
        return instence;
    }

    /**
     * 打开
     */
    public void on() {
        System.out.println("dvd on");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("dvd off");
    }

    /**
     * 播放
     */
    public void play() {
        System.out.println("dvd is play");
    }

    /**
     * 暂停
     */
    public void pause() {
        System.out.println("dvd pause");
    }
}
