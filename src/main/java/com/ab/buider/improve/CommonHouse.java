package com.ab.buider.improve;

/**
 * @author ab
 * @description
 * @date
 */
public class CommonHouse extends HouseBuilder {
    /**
     * 建造流程
     */
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }


}
