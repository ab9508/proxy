package com.ab.decorator;

/**
 * @author ab
 * @description
 * @date
 * 装饰者
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    /**
     * 计算方用的抽象方法: 自己的价格+Drink的价格
     *
     * @return
     */
    @Override
    public float cost() {
        return getPrice() + this.obj.cost();
    }

    /**
     * 描述
     *
     * @return
     */
    @Override
    public String getDes() {
        return super.des + "," + super.getPrice()
                + "," + obj.getDes();
    }
}
