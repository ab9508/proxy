package com.ab.composite;

import sun.security.provider.certpath.OCSP;

/**
 * @author ab
 * @description
 * @date
 */
public abstract class OrganizationCompone {
    /**
     * 名字
     */
    private String name;
    /**
     * 说明
     */
    private String des;

    public OrganizationCompone(String name, String des) {
        this.name = name;
        this.des = des;
    }

    @Override
    public String toString() {
        return "OrganizationCompone{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void add(OrganizationCompone organizationCompone) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationCompone organizationCompone) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    public void print() {
        //默认实现
        throw new UnsupportedOperationException();
    }

}
