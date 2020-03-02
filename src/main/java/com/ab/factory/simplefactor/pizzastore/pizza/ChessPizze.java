package com.ab.factory.simplefactor.pizzastore.pizza;

/**
 * @author ab
 * @description
 * @date
 */
public class ChessPizze extends Pizza {
    /**
     * 准备原材料，不同披萨原材料不同，抽象方法
     */
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
