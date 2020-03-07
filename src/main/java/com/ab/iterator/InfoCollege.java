package com.ab.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ab
 * @description
 * @date
 */
public class InfoCollege implements College {
    List<Department> departmentList;
    int index = 0;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息工程0", "信息工程0");
        addDepartment("信息工程1", "信息工程1");
        addDepartment("信息工程2", "信息工程2");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    /**
     * 增加系的方法
     *
     * @param name
     * @param desc
     */
    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name, desc));
    }

    /**
     * 返回一个迭代器
     */
    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
