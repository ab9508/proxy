package com.ab.factory.simplefactor.pizzastore.order;

/**
 * @author ab
 * @description
 * @date
 */
//相当于一个客户端，发起订购任务
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();
        // 使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("end");

        //静态工厂
        new OrderPizza2();


    }

}