package com.ab.factory.abstractfactory.pizzastore.order;


import com.ab.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.ab.factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import com.ab.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author ab
 * @description
 * @date
 * 这是北京工厂
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
