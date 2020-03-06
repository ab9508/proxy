package com.ab.template;

import com.ab.decorator.Soy;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        System.out.println("制作红豆豆浆");
        SoyaMilk soyaMilk = new RedBeanSoyaMilk();
        soyaMilk.make();

    }
}
