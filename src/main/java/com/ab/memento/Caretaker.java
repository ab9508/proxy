package com.ab.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ab
 * @description
 * @date
 */
public class Caretaker {
    /**
     * 保存备忘对象
     */
    private List<Memento> mementoList = new ArrayList<>();

    /**
     * 添加
     */
    public void add(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * 获取到第index个Originator的备忘录对象(即保存对象)
     */
    public Memento get(int index) {
        return mementoList.get(index);
    }

}
