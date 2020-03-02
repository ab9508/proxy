package com.ab.principle.inversion.improve;


/**
 * @author ab
 * @description
 * @date
 */
public class DependcyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Weixin());
    }

}

/**
 * 定义一个接口
 */
interface IRecevier {
    public String getInfo();
}

//电邮类
class Email implements IRecevier {
    public String getInfo() {
        return "电子邮件信息:hello word";
    }

}

/**
 * 微信
 */
class Weixin implements IRecevier{

    public String getInfo() {
        return "微信的消息";
    }
}

/**
 * 方式2:
 */
class Person {
    public void receive(IRecevier iRecevier) {
        System.out.println(iRecevier.getInfo());
    }
}
