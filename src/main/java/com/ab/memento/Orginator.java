package com.ab.memento;

/**
 * @author ab
 * @description
 * @date
 */
public class Orginator {

    /**
     * 状态信息
     */
    private String state;

    /**
     * 保存一个状态对象 Memento
     *
     * @return
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    /**
     * 通过备忘录对象,进行状态恢复
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
