package com.ab.factory.factorymethod.pizzastore.order;

import com.ab.factory.factorymethod.pizzastore.pizza.*;

/**
 * @author ab
 * @description
 * @date
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
