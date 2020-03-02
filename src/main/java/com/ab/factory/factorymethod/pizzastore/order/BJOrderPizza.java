package com.ab.factory.factorymethod.pizzastore.order;

import com.ab.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.ab.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.ab.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author ab
 * @description
 * @date
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
