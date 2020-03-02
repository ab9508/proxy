package com.ab.factory.simplefactor.pizzastore.order;

import com.ab.factory.simplefactor.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ab
 * @description
 * @date
 */
public class OrderPizza {

    //    //构造类型
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = gettype();
//            if (orderType.equals("greek")) {
//                pizza.setName("希腊披萨");
//                pizza = new GreekPizza();
//            } else if (orderType.equals("cheese")) {
//                pizza = new ChessPizze();
//                pizza.setName("奶酪披萨");
//            } else if (orderType.equals("pepper")) {
//                pizza = new PepperPizza();
//                pizza.setName("胡椒");
//            } else {
//                break;
//            }
//            //输出pizza的制作过程
//            pizza.prepare();
//            pizza.back();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }
    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }


    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";//用户输入的
        this.simpleFactory = simpleFactory;
        do {
            orderType = gettype();
            this.pizza = this.simpleFactory.createPizza(orderType);
            if(pizza != null) {
                pizza.prepare();
                pizza.back();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
                break;
            }
        } while (true);

    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


}
