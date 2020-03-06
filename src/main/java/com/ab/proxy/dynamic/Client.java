package com.ab.proxy.dynamic;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDao();
        //给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        //内存中生成了代理对象
        System.out.println("proxyInstance= " + proxyInstance);
        proxyInstance.teach();
        proxyInstance.sayHello("ab");
    }
}
