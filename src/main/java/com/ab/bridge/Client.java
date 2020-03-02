package com.ab.bridge;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //获取折叠手机(样式+品牌)
        Phone phone = new FoldedPhone(new Xiaomi());
        phone.call();
        phone.open();
        phone.close();

        System.out.println("==");
        Phone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("----");
        Phone phone3 = new UpRightPhgone(new Vivo());
        phone3.open();
        phone3.call();
        phone3.close();


    }
}
