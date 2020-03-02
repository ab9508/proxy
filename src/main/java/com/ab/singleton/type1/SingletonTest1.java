package com.ab.singleton.type1;

/**
 * @author ab
 * @description
 * @date
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);//true

    }

}

/**
 * 饿汉式（静态变量）
 */
class Singleton {
    /**
     * 1. 构造器私有化，外部不能new
     */
    private Singleton() {
    }

    /**
     * 2. 本类内部创建对象实例
     */
    private final static Singleton instance = new Singleton();

    /**
     * 3. 提供一个共有的静态方法，返回实例对象
     */
    public static Singleton getInstance() {
        return instance;
    }

}