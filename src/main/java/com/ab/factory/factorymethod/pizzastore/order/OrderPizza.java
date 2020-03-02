package com.ab.factory.factorymethod.pizzastore.order;


import com.ab.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ab
 * @description
 * @date
 */
public abstract class OrderPizza {
    //定义一个抽象方法，createPizza，让各个工厂子类自己实现
    public abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza() {
        setFactory();
    }

    Pizza pizza = null;

    public void setFactory() {
        //用户输入的
        String orderType = "";
        //抽象方法，由子类去实现
        do {
            orderType = gettype();
            pizza = createPizza(orderType);
            if (this.pizza != null) {
                this.pizza.prepare();
                this.pizza.back();
                this.pizza.cut();
                this.pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);

    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String gettype() {
        try {
            BufferedReader strin = null;
            strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


}
