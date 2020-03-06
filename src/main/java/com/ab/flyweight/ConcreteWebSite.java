package com.ab.flyweight;

import javax.jws.soap.SOAPBinding;

/**
 * @author ab
 * @description 具体的网站
 * @date
 */
public class ConcreteWebSite extends WebSite {
    /**
     * 内部状态：共享的部分
     * 网站发布类型
     */
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布形式为：" + type + "，使用者：" + user.getName());
    }
}
