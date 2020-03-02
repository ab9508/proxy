package com.ab.uml.composition;

/**
 * @author ab
 * @description
 * @date
 */
public class Computer {
    /**
     * 不可分离
     */
    private Mouse mouse = new Mouse();
    /**
     * 不可分离
     */
    private Monitor monitor = new Monitor();

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }


}
