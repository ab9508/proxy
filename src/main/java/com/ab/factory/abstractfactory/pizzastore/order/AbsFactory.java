package com.ab.factory.abstractfactory.pizzastore.order;


import com.ab.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author ab
 * @description
 * @date 一个抽象工厂模式的抽象成（接口）
 */
public interface AbsFactory {
    /**
     *
     * @param orderType
     * @return
     */
    Pizza createPizza(String orderType);

}
