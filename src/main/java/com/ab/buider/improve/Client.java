package com.ab.buider.improve;


/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commanHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commanHouse);
        //完成建造，返回产品
        House house = houseDirector.constructHouse();

        //盖高楼
        HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);
        houseDirector.constructHouse();


        StringBuilder ab = new StringBuilder("ab");


    }
}
