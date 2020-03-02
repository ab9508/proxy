package com.ab.composite;

/**
 * @author ab
 * @description
 * @date
 */
public class Department extends OrganizationCompone {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getName());
    }
}
