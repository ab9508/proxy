package com.ab.visitor;

/**
 * @author ab
 * @description
 * @date
 */
public class Man extends Person {

    /**
     * 提供一个接口,让访问者可以访问
     *
     * @param action
     */
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
