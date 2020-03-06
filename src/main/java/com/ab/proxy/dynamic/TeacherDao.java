package com.ab.proxy.dynamic;

/**
 * @author ab
 * @description
 * @date
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
