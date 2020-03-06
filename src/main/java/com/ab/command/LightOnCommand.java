package com.ab.command;

/**
 * @author ab
 * @description
 * @date
 */
public class LightOnCommand implements Command {
    /**
     * 聚合LightReceiver
     */
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    /**
     * 执行某个命令
     */
    @Override
    public void execute() {
        //调用接收者的方法
        light.on();
    }

    /**
     * 撤销某个命令
     */
    @Override
    public void undo() {
        //调用接收者的方法
        light.off();
    }
}
