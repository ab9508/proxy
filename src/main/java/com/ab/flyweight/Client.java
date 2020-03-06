package com.ab.flyweight;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 创建一个工厂类
         */
        WebSiteFactory factory = new WebSiteFactory();
        /**
         * 客户要一个已新闻形式发布的网站
         */
        WebSite webSite = factory.getWebSiteCategory("新闻");
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        WebSite webSite4 = factory.getWebSiteCategory("博客");

        webSite.use(new User("1"));
        webSite2.use(new User("2"));
        webSite3.use(new User("3"));
        webSite4.use(new User("4"));

        int size = factory.getWebSite();
        System.out.println(size);
    }
}
