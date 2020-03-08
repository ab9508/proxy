package com.ab.memento;

/**
 * @author ab
 * @description
 * @date
 */
public class Memento {
    /**
     * 状态
     */
    private String state;

    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state='" + state + '\'' +
                '}';
    }
}
