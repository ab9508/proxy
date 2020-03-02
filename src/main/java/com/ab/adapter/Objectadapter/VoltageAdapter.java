package com.ab.adapter.Objectadapter;

/**
 * @author ab
 * @description
 * @date 适配器类
 */
public class VoltageAdapter implements IVoltage5V {

    /**
     * 关联关系里的聚合
     */
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (voltage220V != null) {
            //获取220V
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配器,进行适配");
            dstV = srcV / 44;
        }
        //输出5V
        return dstV;
    }
}
