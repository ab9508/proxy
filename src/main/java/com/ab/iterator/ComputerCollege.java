package com.ab.iterator;

import java.util.Iterator;

/**
 * @author ab
 * @description
 * @date
 */
public class ComputerCollege implements College {
    Department[] departments;
    /**
     * 保存当前数组的对象个数
     */
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("专业0", "专业0");
        addDepartment("专业1", "专业1");
        addDepartment("专业2", "专业2");
        addDepartment("专业3", "专业3");
//        addDepartment("专业4", "专业4");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    /**
     * 增加系的方法
     *
     * @param name
     * @param desc
     */
    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    /**
     * 返回一个迭代器
     */
    @Override
    public Iterator createIterator() {
        return new ComputCollegeIterator(departments);
    }
}
