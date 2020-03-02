package com.ab.buider.improve;

/**
 * @author ab
 * @description
 * @date
 */
public class HighHouse extends HouseBuilder {
    /**
     * 建造流程
     */
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
