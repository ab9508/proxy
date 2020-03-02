package com.ab.factory.simplefactor.pizzastore.order;

import com.ab.factory.simplefactor.pizzastore.pizza.ChessPizze;
import com.ab.factory.simplefactor.pizzastore.pizza.GreekPizza;
import com.ab.factory.simplefactor.pizzastore.pizza.PepperPizza;
import com.ab.factory.simplefactor.pizzastore.pizza.Pizza;

/**
 * @author ab
 * @description
 * @date
 */
//静态工厂类
public class SimpleFactory2 {
    /**
     * 根据orderType返回对应的Pizza对象
     *
     * @param orderType
     * @return
     */
    public static Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂");
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new ChessPizze();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒");
        }
        return pizza;
    }

}
