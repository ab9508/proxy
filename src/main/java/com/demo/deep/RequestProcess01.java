package com.demo.deep;

import com.demo.deep.DeepRequest;
import com.demo.deep.RequesrProcess;

/**
 * @author ab
 * @description
 * @date
 */
public class RequestProcess01 implements RequesrProcess {
    @Override
    public void process(DeepRequest request) {
        System.out.println(this.getClass().getName());
        if (request.getAge() == 5) {
            request.setAge(request.getAge() + 50);
        }
    }
}
