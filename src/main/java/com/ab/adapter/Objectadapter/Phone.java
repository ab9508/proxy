package com.ab.adapter.Objectadapter;

/**
 * @author ab
 * @description
 * @date
 */
public class Phone {

    /**
     * 充电
     *
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压5V可以充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V,无法充电");
        }
    }
}
