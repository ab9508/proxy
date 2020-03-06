package com.ab.template;

/**
 * @author ab
 * @description
 * @date
 */
public class RedBeanSoyaMilk extends SoyaMilk {

    /**
     * 添加不同的材料，抽象方法，子类具体实现
     */
    @Override
    void addCondiments() {
        System.out.println("加入红豆");
    }
}
