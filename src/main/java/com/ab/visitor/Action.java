package com.ab.visitor;

/**
 * @author ab
 * @description
 * @date
 */
public abstract class Action {
    /**
     * 得到男的测评结果
     */
    public abstract void getManResult(Man man);

    /**
     * 得到女的测评
     */
    public abstract void getWomanResult(Woman woman);

}
