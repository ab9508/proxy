package com.ab.visitor;

/**
 * @author ab
 * @description 这里使用到了双分派:
 * 1.即首先在客户端程序中,将具体状态做为参数传到woman中,这是第一次分派
 * 2.然后Woman类调用了作为参数的具体方法getWomanResult,同时将自己this作为参数传入,即第二次分派
 * @date
 */
public class Woman extends Person {

    /**
     * 提供一个接口,让访问者可以访问
     *
     * @param action
     */
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
