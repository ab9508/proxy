package com.ab.bridge;

/**
 * @author ab
 * @description
 * @date
 */
public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("小米开机");
    }

    @Override
    public void close() {
        System.out.println("小米关机");
    }

    @Override
    public void call() {
        System.out.println("小米电话");
    }
}
