package com.ab.decorator;

/**
 * @author ab
 * @description 客户端, 商店
 * @date
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单:2份巧克力+1份牛奶的LongBlak
        Drink drink = new LongBlack();
//        Drink drink = new DeCaf();
        System.out.println("描述:" + drink.getDes() + "\t价格:" + drink.cost());
        drink = new Milk(drink);
        System.out.println("描述:" + drink.getDes() + "\t价格:" + drink.cost());
        drink = new Chocate(drink);
        System.out.println("描述:" + drink.getDes() + "\t价格:" + drink.cost());
        drink = new Chocate(drink);
        System.out.println("描述:" + drink.getDes() + "\t价格:" + drink.cost());

    }

}
