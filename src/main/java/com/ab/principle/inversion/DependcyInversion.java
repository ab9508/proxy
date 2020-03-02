package com.ab.principle.inversion;


/**
 * @author ab
 * @description
 * @date
 */
public class DependcyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}

//电邮类
class Email {
    public String getInfo() {
        return "电子邮件信息:hello word";
    }

}

/**
 * 完成Person接受消息的功能,
 * 方式1:
 * 1. 简单,比较容易实现
 * 2. 如果获取的对象式微信,短信等等,则新增类,提示person也要增加相应接收方法
 * 3. 解决思路:引入一个抽象的接口IReceiver,表示接收着,这样person与接收发生依赖
 * 因为Email.微信等等属于接受着的范围,则他们各自实现IReceiver,符合依赖倒转原则
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
