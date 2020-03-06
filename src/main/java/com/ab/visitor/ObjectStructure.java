package com.ab.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ab
 * @description 数据结构, 管理很多人
 * @date
 */
public class ObjectStructure {
    /**
     * 维护了一个集合
     */
    private List<Person> persons = new LinkedList<>();

    /**
     * 增加到list
     */
    public void attach(Person p) {
        persons.add(p);
    }

    /**
     * 移除
     */
    public void detach(Person p) {
        persons.remove(p);
    }

    /**
     * 显示测评详情
     */
    public void display(Action action) {
        for (Person p : persons) {
            p.accept(action);
        }
    }

}
