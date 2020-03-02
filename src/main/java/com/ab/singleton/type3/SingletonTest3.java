package com.ab.singleton.type3;

/**
 * @author ab
 * @description
 * @date
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        System.out.println("懒汉式，线程不安全");
        Single instance = Single.getInstance();
        Single instance2 = Single.getInstance();
        System.out.println(instance == instance2);
    }
}

/**
 * 懒汉式
 */
class Single {
    private Single() {
    }

    private static Single instance;

    /**
     * 懒汉式：提供一个方法，即使用该方法时，才去创建instance
     */
    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }


}