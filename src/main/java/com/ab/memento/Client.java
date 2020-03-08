package com.ab.memento;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //
        Orginator orginator = new Orginator();
        Caretaker caretaker = new Caretaker();

        orginator.setState("状态1");
        //保存当前的状态
        caretaker.add(orginator.saveStateMemento());

        orginator.setState("状态2");
        caretaker.add(orginator.saveStateMemento());
        orginator.setState("状态3");
        caretaker.add(orginator.saveStateMemento());

        //恢复状态
        System.out.println("当前状态:" + orginator.getState());
        orginator.getStateFromMemento(caretaker.get(1));
        System.out.println("恢复后状态:" + orginator.getState());
    }
}
