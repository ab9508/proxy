package com.ab.flyweight;

import java.util.HashMap;

/**
 * @author ab
 * @description 网站工厂类，根据需求返回一个网站
 * @date
 */
public class WebSiteFactory {
    /**
     * 集合，充当池的作用
     */
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    /**
     * 根据网站的类型返回一个网站，
     * 如果没有就创建一个网站，放入池，并返回
     */
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    /**
     * 获取网站中分类的总数（也就是池中有多少个网站类型）
     */
    public int getWebSite() {
        return pool.size();
    }

}
