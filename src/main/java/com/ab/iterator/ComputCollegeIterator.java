package com.ab.iterator;

import java.util.Iterator;

/**
 * @author ab
 * @description
 * @date
 */
public class ComputCollegeIterator implements Iterator {
    /**
     * 需要知道Department是以怎样的方式存放,
     * 数组
     */
    Department[] departments;
    /**
     * 遍历的位置
     */
    int position = 0;

    public ComputCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个元素
     */
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            position += 1;
        }
        return true;
    }

    /**
     *
     */
    @Override
    public Object next() {
        Department department = departments[position - 1];
        return department;
    }

}
