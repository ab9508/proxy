package com.ab.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ab
 * @description
 * @date
 */
public class ProxyFactory {
    /**
     * 维护一个目标
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     */
    public Object getProxyInstance() {
        //第一个参：ClassLoader loader,指定目标对象是使用的类加载器
        //第二个参：Class<?>[] interfaces,目标对象实现的接口类型，使用范型方法确认类型
        //第三个参：InvocationHandler h,事情处理，执行目标对象地方法,会触发处理器的方法,会把当前执行的目标对象的方法作为参数
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk代理开始");
                        //反射机制调用目标对象的方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println("jdk代理提交");
                        return returnVal;
                    }
                });
    }

}
