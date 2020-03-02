package com.ab.factory.abstractfactory.pizzastore.order;

import com.ab.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.ab.factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import com.ab.factory.abstractfactory.pizzastore.pizza.Pizza;


/**
 * @author ab
 * @description
 * @date
 * 这是北京工厂
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
