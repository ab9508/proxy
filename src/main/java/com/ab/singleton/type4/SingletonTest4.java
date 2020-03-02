package com.ab.singleton.type4;

/**
 * @author ab
 * @description
 * @date
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        System.out.println("懒汉式，加synchronize锁同步处理，线程安全");
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
     * 加入synchronize锁同步，解决线程安全问题，但是效率较低
     */
    public static synchronized Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }


}