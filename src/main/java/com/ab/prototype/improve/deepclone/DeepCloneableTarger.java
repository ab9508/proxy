package com.ab.prototype.improve.deepclone;

import java.io.Serializable;

/**
 * @author ab
 * @description
 * @date
 */
public class DeepCloneableTarger implements Serializable, Cloneable {
    private final static long sertalVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarger(String cloneClass, String cloneName) {
        this.cloneClass = cloneClass;
        this.cloneName = cloneName;
    }

    @Override
    public String toString() {
        return "DeepCloneableTarger{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }

    /**
     * 因为该类的属性都是String,因此使用默认的clone完成即可
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {


        return super.clone();

    }
}
