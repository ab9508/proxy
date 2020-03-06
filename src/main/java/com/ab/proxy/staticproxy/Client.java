package com.ab.proxy.staticproxy;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象，同时将被代理对象段递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理对象，调用到被代理对象地方法
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
        //即：值型的是代理对象地方法，代理对象再去调用目标对象地方法
        proxy.teach();

    }
}
