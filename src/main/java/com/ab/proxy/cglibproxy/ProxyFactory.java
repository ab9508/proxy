package com.ab.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ab
 * @description
 * @date
 */
public class ProxyFactory implements MethodInterceptor {
    /**
     * 维护目标对象
     */
    private Object target;

    /**
     * @param target 被代理的对象
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * @return 返回一个代理对象, 是一个target对象的代理对象
     */
    public Object getProxyInstance() {
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象,即代理对象
        return enhancer.create();
    }

    /**
     * 重写intercept方法,会调用目标对象的方法
     *
     * @param o
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理,start");
        Object returnVal = method.invoke(target, args);
        System.out.println("cglib提交,commit");
        return returnVal;
    }
}
