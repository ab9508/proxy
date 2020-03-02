package com.ab.factory.abstractfactory.pizzastore.pizza;

/**
 * @author ab
 * @description
 * @date
 */
public class LDCheesePizza extends Pizza {

    /**
     * 准备原材料，不同披萨原材料不同，抽象方法
     */
    @Override
    public void prepare() {
        setName("伦敦的奶酪披萨");
        System.out.println("伦敦的奶酪披萨准备原材料");
    }
}
