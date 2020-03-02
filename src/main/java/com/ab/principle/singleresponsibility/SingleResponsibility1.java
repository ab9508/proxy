package com.ab.principle.singleresponsibility;

/**
 * @author ab
 * @description
 * @date
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托");
        vehicle.run("汽车");
        vehicle.run("飞机");

    }
}

//交通工具类
//方式1:
//1. 方式一中run(),违反了单一职责原则
//2. 解决的方案非常简单,根据交通工具的运行方式不同,分解成不同类即可
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上跑");
    }
}
