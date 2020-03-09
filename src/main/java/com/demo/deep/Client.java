package com.demo.deep;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //创建请求
        DeepRequest request = DeepRequest.getInstance();
        request.setAge(5);
        request.setId(1);
        DeepRequest request2 = DeepRequest.getInstance();
        System.out.println(request);
        System.out.println(request2);
        System.out.println(request == request2);


        //设置执行顺序
        Process01 process01 = new Process01();
        Process02 process02 = new Process02();
        Process03 process03 = new Process03();
        Process04 process04 = new Process04();
        process01.setProcess(process02);
        process02.setProcess(process03);
        process03.setProcess(process04);
        process01.process(request);
        System.out.println(request);

    }
}
