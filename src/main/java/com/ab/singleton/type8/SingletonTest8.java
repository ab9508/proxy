package com.ab.singleton.type8;

/**
 * @author ab
 * @description
 * @date
 */
public class SingletonTest8 {
    public static void main(String[] args) {
        System.out.println("枚举实现单例，推荐使用");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance = instance2);
        System.out.println(instance);

    }
}

enum Singleton {
    INSTANCE;

    public void sayOk() {
        System.out.println("OK");
    }
}