package com.ab.proxy.staticproxy;

/**
 * @author ab
 * @description 静态代理
 * @date
 */
public class TeacherDaoProxy implements ITeacherDao {
    /**
     * 目标对象，通过接口来聚合
     */
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    /**
     * 授课的方法
     */
    @Override
    public void teach() {
        System.out.println("代理开始");
        target.teach();
        System.out.println("提交结束");
    }
}
