package com.ab.factory.abstractfactory.pizzastore.order;

import com.ab.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ab
 * @description
 * @date
 */
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory absFactory){
        setFactory(absFactory);
    }

    public void setFactory(AbsFactory absFactory) {
        this.factory = absFactory;
        Pizza pizza = null;
        //是用户输入的类型
        do {
            String orderType = getType();
            pizza = this.factory.createPizza(orderType);
            System.out.println("pizza= " + pizza);
            if (pizza != null) {
                pizza.prepare();
                pizza.back();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订单失败");
            }
        } while (true);
    }

    private String getType() {
        System.out.println("input pizza type:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String orderType = "";
        try {
            orderType = reader.readLine();
            return orderType;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
