package com.ab.uml.composition1;

/**
 * @author ab
 * @description
 * @date
 */
public class Person {
    /**
     * 可以分离，聚合关系
     */
    private IDCard card;
    /**
     * 不可分离，组合关系
     */
    private Head head = new Head();

}
