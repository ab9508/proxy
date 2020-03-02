package com.ab.principle.seregation.impl;

/**
 * @author ab
 * @description
 * @date
 */
public class Sergation1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.depend1(b);
        a.depend2(b);
        a.depend3(b);
        C c = new C();
        D d = new D();
        c.depend1(d);
        c.depend4(d);
        c.depend5(d);

    }
}

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

class B implements Interface1, Interface2 {

    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    public void operation3() {
        System.out.println("B 实现了operation3");
    }

}

class D implements Interface1, Interface3 {

    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    public void operation4() {
        System.out.println("D 实现了operation4");
    }

    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}

//A类通过接口Interface1,Interface2,依赖使用B类,但是只会用到1,2,3方法
class A {

    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}

//C类通过Interface1接口,Interface3,依赖使用D类,但是只会使用1,4,5方法
class C {

    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}