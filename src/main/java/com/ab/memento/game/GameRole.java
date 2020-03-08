package com.ab.memento.game;

/**
 * @author ab
 * @description
 * @date
 */
public class GameRole {
    private int vit;
    private int def;

    /**
     * 创建Memento,即根据当前的状态得到memento
     */
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    /**
     * 从备忘录对象恢复GameRole状态
     */
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    /**
     * 显示当前游戏角色的状态
     */
    public void display() {
        System.out.println("当前角色攻击力:" + this.vit + "\t防御力:" + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
