package com.ab.command;

/**
 * @author ab
 * @description
 * @date
 */
public class TVOffCommand implements Command {
    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    /**
     * 执行某个命令
     */
    @Override
    public void execute() {
        tvReceiver.off();
    }

    /**
     * 撤销某个命令
     */
    @Override
    public void undo() {
        tvReceiver.on();
    }
}
