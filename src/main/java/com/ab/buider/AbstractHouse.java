package com.ab.buider;

/**
 * @author ab
 * @description
 * @date
 */
public abstract class AbstractHouse {
    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    /**
     * 必须按序执行：
     */
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
