package com.ab.composite;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //创建学校
        OrganizationCompone university = new University("清华大学", "地址北京");
        //创建学院
        OrganizationCompone college = new College("计算机学院", "计算机学院");
        OrganizationCompone college2 = new College("信息工程学院", "信息工程学院");
        university.add(college);
        university.add(college2);
        //创建专业
        college.add(new Department("软件工程", "软件工程"));
        college.add(new Department("网络工程", "网络工程"));
        college.add(new Department("计算机科学与技术", "计算机科学与技术"));

        college2.add(new Department("通信学院", "通信学院"));
        college2.add(new Department("信息学院", "信息学院"));

        university.print();
        college2.print();

    }
}
