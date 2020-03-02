package com.ab.adapter.interfaceadapter;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                super.m1();
                System.out.println("使用了m1方法");
            }
        };
        absAdapter.m1();
    }

}
