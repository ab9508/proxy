package com.ab.memento.game;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ab
 * @description 守护者对象, 保存游戏角色的状态
 * @date
 */
public class Caretaker {
    /**
     * 只保存一次状态
     */
    private Memento memento;
    /**
     * 保存一个对象的多次状态
     */
    private ArrayList<Memento> mementos;
    /**
     * 保存对象的多个角色
     */
    private HashMap<String, ArrayList<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
