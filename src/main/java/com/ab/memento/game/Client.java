package com.ab.memento.game;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setDef(100);
        gameRole.setVit(100);

        System.out.println("vs boss 之前");
        gameRole.display();
        //保存当前状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("vs boss");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();
        //恢复
        System.out.println("恢复");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();


    }
}
