package com.ab.principle.singleresponsibility;

/**
 * @author ab
 * @description
 * @date
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        AriVehicle ariVehicle = new AriVehicle();
        ariVehicle.run("飞机");


    }
}
//方案2
//1. 遵守單一职责原则
//2. 但是这样做的改动很大,即将类分解,很容易修改客户端
//3. 改: 直接修改Vehicle.class
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行");
    }
}

class AriVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在天空中运行");
    }
}

