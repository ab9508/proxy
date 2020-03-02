package com.ab.buider;

/**
 * @author ab
 * @description
 * @date
 */
public class CommonHouse extends AbstractHouse {
    /**
     * 打地基
     */
    @Override
    public void buildBasic() {
        System.out.println("给普通房子大地基");
    }

    /**
     * 砌墙
     */
    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    /**
     * 封顶
     */
    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
