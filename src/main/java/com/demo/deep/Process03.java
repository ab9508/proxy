package com.demo.deep;

/**
 * @author ab
 * @description
 * @date
 */
public class Process03 extends Process {

    @Override
    public void process(DeepRequest request) {
        System.out.println(this.getClass().getName());
        process.process(request);
    }
}
