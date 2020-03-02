package com.ab.decorator;

/**
 * @author ab
 * @description 具体的Decorate, 调味品
 * @date
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }

}
