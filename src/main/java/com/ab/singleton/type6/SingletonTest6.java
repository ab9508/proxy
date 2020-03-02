package com.ab.singleton.type6;

/**
 * @author ab
 * @description
 * @date
 */
public class SingletonTest6 {
    public static void main(String[] args) {
        System.out.println("懒汉式，加synchronize锁同步处理，线程安全");
        Single instance = Single.getInstance();
        Single instance2 = Single.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance);
    }
}

/**
 * 懒汉式
 */
class Single {
    private Single() {
    }

    /**
     * volatile: 每次读取前先到主内存获取最新的值，操作完毕，立即跟新到主内存，
     * 对其他线程可见
     */
    private static volatile Single instance;

    /**
     * 懒汉式：提供一个方法，即使用该方法时，才去创建instance
     * 加入双重检查，解决线程安全问题，同时保证了效率
     */
    public static Single getInstance() {
        if (instance == null) {
            synchronized (Single.class) {
                if (instance == null) {
                    instance = new Single();
                }
            }
        }
        return instance;
    }


}