package com.ab.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ab
 * @description
 * @date
 */
public class College extends OrganizationCompone {

    List<OrganizationCompone> organizationCompones = new ArrayList<>();

    /**
     * 构造器
     *
     * @param name
     * @param des
     */
    public College(String name, String des) {
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

    @Override
    public void print() {
        System.out.println("---" + getName() + "----");
        organizationCompones.stream().forEach(System.out::println);
    }
}
