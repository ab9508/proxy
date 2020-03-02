package com.ab.uml.aggregation;

/**
 * @author ab
 * @description
 * @date
 */
public class Computer {
    /**
     * 可以分离
     */
    private Mouse mouse;
    /**
     * 可以分离
     */
    private Monitor monotir;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonotir(Monitor monotir) {
        this.monotir = monotir;
    }

}
