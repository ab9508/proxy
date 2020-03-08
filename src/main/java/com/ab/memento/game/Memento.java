package com.ab.memento.game;

/**
 * @author ab
 * @description
 * @date
 */
public class Memento {
    /**
     * 攻击力,防御力
     */
    private int vit;
    private int def;


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

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }
}
