package com.ab.command;

/**
 * @author ab
 * @description
 * @date
 */
public class LightOffCommand implements Command {
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    /**
     * 执行某个命令
     */
    @Override
    public void execute() {
        light.off();
    }

    /**
     * 撤销某个命令
     */
    @Override
    public void undo() {
        light.on();
    }
}
