package com.ab.visitor;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Woman());
        //成功
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("====");
        //失败
        Fail fail = new Fail();
        objectStructure.display(fail);
        //待定
        Wait wait = new Wait();
        objectStructure.display(wait);

    }
}
