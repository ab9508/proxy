package com.ab.iterator;

import java.util.Iterator;

/**
 * @author ab
 * @description 学院
 * @date
 */
public interface College {
    public String getName();

    /**
     * 增加系的方法
     */
    public void addDepartment(String name, String desc);

    /**
     * 返回一个迭代器
     */
    public Iterator createIterator();
}
