package com.ab.decorator;

/**
 * @author ab
 * @description 具体的Decorate, 调味品
 * @date
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }

}
