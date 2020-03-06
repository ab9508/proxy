package com.ab.template.improve;

/**
 * @author ab
 * @description
 * @date
 */
public class PureSoyaMilk extends SoyaMilk {

    /**
     * 添加不同的材料，抽象方法，子类具体实现
     */
    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
