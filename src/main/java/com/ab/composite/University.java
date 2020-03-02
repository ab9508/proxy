package com.ab.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ab
 * @description University就是Composite, 可以管理Collega
 * @date
 */
public class University extends OrganizationCompone {
    List<OrganizationCompone> organizationCompones = new ArrayList<>();

    /**
     * 构造器
     *
     * @param name
     * @param des
     */
    public University(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationCompone organizationCompone) {
        organizationCompones.add(organizationCompone);
    }

    @Override
    public void remove(OrganizationCompone organizationCompone) {
        organizationCompones.remove(organizationCompone);
    }

    /**
     * 输出包含的学院
     */
    @Override
    public void print() {
        System.out.println("---" + getName() + "----");
        organizationCompones.stream().forEach(System.out::println);
    }
}
