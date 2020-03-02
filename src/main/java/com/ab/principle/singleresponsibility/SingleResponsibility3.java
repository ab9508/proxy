package com.ab.principle.singleresponsibility;

/**
 * @author ab
 * @description
 * @date
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");

    }

}


//1. 没有对袁磊的类没有做大的修改,只增加方法
//2. 虽然没有在类上遵守大一职责原则,但是在方法级别上,任然遵守单一职责原则
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上跑");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空中");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中");
    }

}