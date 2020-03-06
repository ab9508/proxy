package com.ab.template;

/**
 * @author ab
 * @description
 * @date
 */
public abstract class SoyaMilk {
    /**
     * 模板方法：可以做成final，不让子类去覆盖
     */
    public void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    void select() {
        System.out.println("第一步：选择好的新黄豆");
    }

    /**
     * 添加不同的材料，抽象方法，子类具体实现
     */
    abstract void addCondiments();

    void soak() {
        System.out.println("第三步：黄豆和配料开始浸泡");
    }

    void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }

}
