package com.ab.adapter.classadapter;

/**
 * @author ab
 * @description
 * @date
 * 被适配的类
 */
public class Voltage220V {
    /**
     * 输出220V
     *
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压" + 220 + "伏");
        return src;
    }
}
