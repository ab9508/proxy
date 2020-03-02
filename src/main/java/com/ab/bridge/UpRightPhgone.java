package com.ab.bridge;

/**
 * @author ab
 * @description
 * @date
 */
public class UpRightPhgone extends Phone {

    public UpRightPhgone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("直立样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立样式手机");
    }
}
