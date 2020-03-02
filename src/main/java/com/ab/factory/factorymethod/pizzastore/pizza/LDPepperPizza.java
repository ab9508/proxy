package com.ab.factory.factorymethod.pizzastore.pizza;

/**
 * @author ab
 * @description
 * @date
 */
public class LDPepperPizza extends Pizza {


    /**
     * 准备原材料，不同披萨原材料不同，抽象方法
     */
    @Override
    public void prepare() {
        setName("伦敦的胡椒披萨");
        System.out.println("伦敦的胡椒披萨 准备原材料");
    }
}
