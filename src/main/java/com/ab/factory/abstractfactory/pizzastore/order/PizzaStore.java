package com.ab.factory.abstractfactory.pizzastore.order;

import java.util.Calendar;

/**
 * @author ab
 * @description
 * @date
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new BJFactory());
    }
}
