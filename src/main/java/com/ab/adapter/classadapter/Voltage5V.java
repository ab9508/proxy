package com.ab.adapter.classadapter;

/**
 * @author ab
 * @description
 * @date
 */
public class Voltage5V {
    /**
     * 输出220V
     *
     * @return
     */
    public int output5V() {
        int src = 5;
        System.out.println("电压" + 5 + "伏");
        return src;
    }
}
