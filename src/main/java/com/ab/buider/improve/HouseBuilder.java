package com.ab.buider.improve;

/**
 * @author ab
 * @description
 * @date
 */
public abstract class HouseBuilder {
    protected House house = new House();

    /**
     * 建造流程
     */
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    /**
     * 建造好后，讲这个产品返回
     */
    public House buildHouse() {
        return house;
    }

}
