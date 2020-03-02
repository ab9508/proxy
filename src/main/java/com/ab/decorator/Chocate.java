package com.ab.decorator;

/**
 * @author ab
 * @description 具体的Decorate, 调味品
 * @date
 */
public class Chocate extends Decorator {

    public Chocate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);
    }

}
