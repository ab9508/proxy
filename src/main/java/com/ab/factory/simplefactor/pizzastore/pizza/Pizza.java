package com.ab.factory.simplefactor.pizzastore.pizza;

/**
 * @author ab
 * @description
 * @date
 */
public abstract class Pizza {
    protected String name;

    /**
     * 准备原材料，不同披萨原材料不同，抽象方法
     */
    public abstract void prepare();

    public void back() {
        System.out.println(name + " backing");
    }

    public void cut() {
        System.out.println(name + " cutting");
    }

    public void box() {
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
