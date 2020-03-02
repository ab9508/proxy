package com.ab.factory.abstractfactory.pizzastore.pizza;

/**
 * @author ab
 * @description
 * @date
 */
public class BJPepperPizza extends Pizza {

    /**
     * 准备原材料，不同披萨原材料不同，抽象方法
     */
    @Override
    public void prepare() {
        setName("北京的胡椒披萨");
        System.out.println("北京的胡椒披萨准备完毕");
    }
}
