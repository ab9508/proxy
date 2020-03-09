package com.demo.deep;

/**
 * @author ab
 * @description
 * @date
 */
public class Process01 extends Process {

    @Override
    public void process(DeepRequest request) {
        System.out.println(this.getClass().getName());
        new RequestProcess01().process(request);
        process.process(request);
    }
}
