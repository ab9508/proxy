package com.ab.singleton.type7;

/**
 * @author ab
 * @description
 * @date
 */
public class singletonTest7 {
    public static void main(String[] args) {
        System.out.println("静态内部类，推荐使用");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance);
    }
}

/**
 * 静态内部类：
 * 1. 外部类被装载的时候，内部类不会立即被装载
 * 2.
 */
class Singleton {
    /**
     * 构造器私有化
     */
    private Singleton() {
    }

    /**
     * 写一个静态内部类，该类中有一个静态属性singleton
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提供一个静态公有方法，直接返回Singleton.INSTANCE
     *
     * @return
     */
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;

    }

}