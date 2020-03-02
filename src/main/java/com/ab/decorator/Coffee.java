package com.ab.decorator;

/**
 * @author ab
 * @description
 * @date
 */
public class Coffee extends Drink {

    /**
     * 计算方用的抽象方法
     *
     * @return
     */
    @Override
    public float cost() {
        return super.getPrice();
    }
}
