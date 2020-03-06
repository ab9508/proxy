package com.ab.proxy.staticproxy;

/**
 * @author ab
 * @description
 * @date
 */
public class TeacherDao implements ITeacherDao {
    /**
     * 授课的方法
     */
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}
